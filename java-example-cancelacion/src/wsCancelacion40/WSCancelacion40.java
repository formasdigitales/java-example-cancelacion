
package wsCancelacion40;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSCancelacion40", targetNamespace = "http://wservicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCancelacion40 {


    /**
     * 
     * @param nocertificado
     * @param folios
     * @param accesos
     * @return
     *     returns wsCancelacion40.WsCancelacionResponse
     */
    @WebMethod(operationName = "Cancelacion40_3")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cancelacion40_3", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion403")
    @ResponseWrapper(localName = "Cancelacion40_3Response", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion403Response")
    @Action(input = "http://wservicios/WSCancelacion40/Cancelacion40_3Request", output = "http://wservicios/WSCancelacion40/Cancelacion40_3Response")
    public WsCancelacionResponse cancelacion403(
        @WebParam(name = "nocertificado", targetNamespace = "")
        String nocertificado,
        @WebParam(name = "folios", targetNamespace = "")
        List<WsFolios40> folios,
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos);

    /**
     * 
     * @param fecha
     * @param privateKey
     * @param password
     * @param folios
     * @param publicKey
     * @param accesos
     * @param rfcEmisor
     * @return
     *     returns wsCancelacion40.WsCancelacionResponse
     */
    @WebMethod(operationName = "Cancelacion40_1")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cancelacion40_1", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion401")
    @ResponseWrapper(localName = "Cancelacion40_1Response", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion403Response")
    @Action(input = "http://wservicios/WSCancelacion40/Cancelacion40_1Request", output = "http://wservicios/WSCancelacion40/Cancelacion40_1Response")
    public WsCancelacionResponse cancelacion401(
        @WebParam(name = "rfcEmisor", targetNamespace = "")
        String rfcEmisor,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "folios", targetNamespace = "")
        List<WsFolios40> folios,
        @WebParam(name = "publicKey", targetNamespace = "")
        byte[] publicKey,
        @WebParam(name = "privateKey", targetNamespace = "")
        byte[] privateKey,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos);

    /**
     * 
     * @param fecha
     * @param folios
     * @param signatureType
     * @param accesos
     * @param rfcEmisor
     * @return
     *     returns wsCancelacion40.WsCancelacionResponse
     */
    @WebMethod(operationName = "Cancelacion40_2")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cancelacion40_2", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion402")
    @ResponseWrapper(localName = "Cancelacion40_2Response", targetNamespace = "http://wservicios/", className = "wsCancelacion40.Cancelacion403Response")
    @Action(input = "http://wservicios/WSCancelacion40/Cancelacion40_2Request", output = "http://wservicios/WSCancelacion40/Cancelacion40_2Response")
    public WsCancelacionResponse cancelacion402(
        @WebParam(name = "rfcEmisor", targetNamespace = "")
        String rfcEmisor,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha,
        @WebParam(name = "folios", targetNamespace = "")
        List<WsFolios40> folios,
        @WebParam(name = "signatureType", targetNamespace = "")
        SignatureType signatureType,
        @WebParam(name = "accesos", targetNamespace = "")
        Accesos accesos);

}
