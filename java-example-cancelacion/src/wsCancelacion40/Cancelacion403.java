
package wsCancelacion40;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para Cancelacion40_3 complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Cancelacion40_3"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="nocertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="folios" type="{http://wservicios/}wsFolios40" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Cancelacion40_3", namespace = "http://wservicios/", propOrder = {
    "nocertificado",
    "folios",
    "accesos"
})
public class Cancelacion403 {

    @XmlElement(namespace = "")
    protected String nocertificado;
    @XmlElement(namespace = "")
    protected List<WsFolios40> folios;
    @XmlElement(namespace = "")
    protected Accesos accesos;

    /**
     * Obtiene el valor de la propiedad nocertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNocertificado() {
        return nocertificado;
    }

    /**
     * Define el valor de la propiedad nocertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNocertificado(String value) {
        this.nocertificado = value;
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
