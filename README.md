# java-example-cancelacion
Ejemplo de cancelación Java 

# Requerimientos
* Java 1.8
* Netbeans 11+ (Opcional)

# Estructura de proyecto
- default_package
  - Principal.java
  - wsCancelacion40
    - Accesos.java
    - WSCancelacion40Service.java
    - WSCancelacion40.java
    - WsCancelacionResponse.java

En la clase Principal se integran los métodos, atributos y variables necesarios para cancelar N cantidad de folios.

```java

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    private static Map<String, String> datos = null; // MAPA CONTENEDOR DE LOS DATOS CANCELACION

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

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    List<WsFolios40> lista = new ArrayList<>();

    // LISTA DE FOLIOS A CANCELAR 
    List<WsFolios40> lista = new ArrayList<>();
    lista.add( getFolios40("01", "314FEAB4-8555-446D-831F-E0D187BFDA79", "04588850-B709-430F-9466-82C9541ADEBB") );
    lista.add( getFolios40("02", "269C61E8-687F-46EB-AB40-48A3A3FAEB5B", "") );
    lista.add( getFolios40("03", "7A4F887F-78A4-4C5A-9A7D-1103A7656A6C", "") );
    lista.add( getFolios40("04", "FE39C512-A5D8-42C2-A575-2EB9E220BC52", "") );

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    getFolios40(String, String, String)   return WsFolios40
    getBytes(String)                      return byte[]

```

* El atributo (Map datos) almacena la información requerida para cancelar.
* La variable lista se encarga de almacenar los folios que serán cancelados
* El método getFolios40 se encarga de formar el folio con los datos de cancelación
* El método getBytes retorna el CERTIFICADO CSD y PRIVATE KEY CSD en arreglo de byte[]

