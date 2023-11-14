
package wsCancelacion40;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para Cancelacion40_2 complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Cancelacion40_2"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rfcEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="folios" type="{http://wservicios/}wsFolios40" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="signatureType" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="accesos" type="{http://wservicios/}accesos" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cancelacion40_2", namespace = "http://wservicios/", propOrder = {
    "rfcEmisor",
    "fecha",
    "folios",
    "signatureType",
    "accesos"
})
public class Cancelacion402 {

    @XmlElement(namespace = "")
    protected String rfcEmisor;
    @XmlElement(namespace = "")
    protected String fecha;
    @XmlElement(namespace = "")
    protected List<WsFolios40> folios;
    @XmlElement(namespace = "")
    protected SignatureType signatureType;
    @XmlElement(namespace = "")
    protected Accesos accesos;

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the folios property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the folios property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFolios().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link WsFolios40 }
     * 
     * 
     */
    public List<WsFolios40> getFolios() {
        if (folios == null) {
            folios = new ArrayList<WsFolios40>();
        }
        return this.folios;
    }

    /**
     * Obtiene el valor de la propiedad signatureType.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignatureType() {
        return signatureType;
    }

    /**
     * Define el valor de la propiedad signatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignatureType(SignatureType value) {
        this.signatureType = value;
    }

    /**
     * Obtiene el valor de la propiedad accesos.
     * 
     * @return
     *     possible object is
     *     {@link Accesos }
     *     
     */
    public Accesos getAccesos() {
        return accesos;
    }

    /**
     * Define el valor de la propiedad accesos.
     * 
     * @param value
     *     allowed object is
     *     {@link Accesos }
     *     
     */
    public void setAccesos(Accesos value) {
        this.accesos = value;
    }

}
