

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import wsCancelacion40.Accesos;
import wsCancelacion40.WSCancelacion40;
import wsCancelacion40.WSCancelacion40Service;
import wsCancelacion40.WsCancelacionResponse;
import wsCancelacion40.WsFolio;
import wsCancelacion40.WsFolios40;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Desarrollo
 */

public class Principal {
    
    // SERVICIO UTILIZADO http://dev33.facturacfdi.mx:80/WSCancelacion40Service?wsdl
    
    private static Map<String, String> datos = null; // MAPA CONTENEDOR DE LOS DATOS CANCELACION
    
    public static void main(String[] args) {
        
        datos = new HashMap<>();
        
        // CERTIFICADOS CSD
        datos.put("cerCSD", "C:\\Certificados\\CSD_Sucursal_1_EKU9003173C9_20230517_223850.cer");
        datos.put("keyCSD", "C:\\Certificados\\CSD_Sucursal_1_EKU9003173C9_20230517_223850.key");
        datos.put("passKeyCSD", "12345678a");
        
        // ACCESOS WEB SERVICE PARA PRUEBAS EN FORMAS DIGITALES
        datos.put("userWS", "pruebasWS");
        datos.put("passWS", "pruebasWS");
        
        // DATOS DE CANCELACION
        datos.put("rfcEmisor", "EKU9003173C9");
        datos.put("fechaCancelacion","2023-11-14T13:00:00"); // FORMATO ESTANDAR ISO-8601
        
        // ENVIAMOS LA CANCELACION
        sendCancelacion40_1(datos);
    }
    
    // CANCELACION
    public static void sendCancelacion40_1(Map<String, String> datos){
        
        try {
            // SE INICIA LA INSTANCIA AL WEB SERVICE
            WSCancelacion40Service WSCancelacion40 = new WSCancelacion40Service();
            WSCancelacion40 port = WSCancelacion40.getWSCancelacion40Port();

            // ACCESOS WEB SERVICE
            Accesos accesos = new Accesos();
            accesos.setUsuario(datos.get("userWS"));
            accesos.setPassword(datos.get("passWS"));

            // LISTA DE FOLIOS A CANCELAR 
            List<WsFolios40> lista = new ArrayList<>();
            lista.add( getFolios40("01", "314FEAB4-8555-446D-831F-E0D187BFDA79", "04588850-B709-430F-9466-82C9541ADEBB") );
            lista.add( getFolios40("02", "269C61E8-687F-46EB-AB40-48A3A3FAEB5B", "") );
            lista.add( getFolios40("03", "7A4F887F-78A4-4C5A-9A7D-1103A7656A6C", "") );
            lista.add( getFolios40("04", "FE39C512-A5D8-42C2-A575-2EB9E220BC52", "") );

            // ENVIAMOS LOS DATOS DE CANCELACION Y ALMACENAMOS LA RESPUESTA
            WsCancelacionResponse WSResponse = port.cancelacion401(
                    datos.get("rfcEmisor"),         // STRING
                    datos.get("fechaCancelacion"),  // STRING
                    lista,                          // LIST<FOLIOS40>
                    getBytes(datos.get("cerCSD")),  // BYTE[]
                    getBytes(datos.get("keyCSD")),  // BYTE[]
                    datos.get("passKeyCSD"),        // STRING
                    accesos                         // ACCESOS (CLASE WEB SERVICE)
            );

            // SE IMPRIMEN LOS VALORES DE RESPUESTA
            System.out.println(
                    "Acuse: "+ WSResponse.getAcuse()+"\n"+
                    "CodError: "+ WSResponse.getCodEstatus()+"\n"+
                    "Mensaje: "+WSResponse.getMensaje()+"\n"
            );
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    // METODO PARA OBTENER LOS FOLIOS A CANCELAR
    public static WsFolios40 getFolios40(String motivo, String uuid, String folioSustitucion){
        WsFolios40 WF40 = new WsFolios40();
        WsFolio  WF = new WsFolio();
        WF.setMotivo(motivo);
        WF.setUuid(uuid);
        
        // VERIFICAMOS SI SE TRATA DE UN MOTIVO 01
        WF.setFolioSustitucion( (motivo.equals("01")) ? folioSustitucion : "" );
        
        // SE INSERTA EL FOLIO
        WF40.setFolio(WF);
        
        return WF40;
    }
    
    // METODO PARA OBTENER EL CERTIFICADO Y KEY CSD EN BYTE []
    public static byte[] getBytes(String rutaArchivo) throws IOException {
        Path path = Paths.get(rutaArchivo);
        return Files.readAllBytes(path);
    }
    
}
