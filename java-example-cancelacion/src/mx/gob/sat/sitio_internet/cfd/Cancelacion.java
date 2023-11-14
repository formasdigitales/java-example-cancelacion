
package mx.gob.sat.sitio_internet.cfd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Folios" maxOccurs="unbounded"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Folio"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="UUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *                           &amp;lt;attribute name="Motivo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *                           &amp;lt;attribute name="FolioSustitucion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Signature" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType" form="qualified"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="RfcEmisor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "folios",
    "signature"
})
@XmlRootElement(name = "Cancelacion")
public class Cancelacion {

    @XmlElement(name = "Folios", required = true)
    protected List<Cancelacion.Folios> folios;
    @XmlElement(name = "Signature", namespace = "http://www.sat.gob.mx/sitio_internet/cfd", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "RfcEmisor", required = true)
    protected String rfcEmisor;
    @XmlAttribute(name = "Fecha", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fecha;

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
     * {@link Cancelacion.Folios }
     * 
     * 
     */
    public List<Cancelacion.Folios> getFolios() {
        if (folios == null) {
            folios = new ArrayList<Cancelacion.Folios>();
        }
        return this.folios;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

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
     * &lt;p&gt;Clase Java para anonymous complex type.
     * 
     * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Folio"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;attribute name="UUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *                 &amp;lt;attribute name="Motivo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *                 &amp;lt;attribute name="FolioSustitucion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "folio"
    })
    public static class Folios {

        @XmlElement(name = "Folio", required = true)
        protected Cancelacion.Folios.Folio folio;

        /**
         * Obtiene el valor de la propiedad folio.
         * 
         * @return
         *     possible object is
         *     {@link Cancelacion.Folios.Folio }
         *     
         */
        public Cancelacion.Folios.Folio getFolio() {
            return folio;
        }

        /**
         * Define el valor de la propiedad folio.
         * 
         * @param value
         *     allowed object is
         *     {@link Cancelacion.Folios.Folio }
         *     
         */
        public void setFolio(Cancelacion.Folios.Folio value) {
            this.folio = value;
        }


        /**
         * &lt;p&gt;Clase Java para anonymous complex type.
         * 
         * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *       &amp;lt;attribute name="UUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
         *       &amp;lt;attribute name="Motivo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
         *       &amp;lt;attribute name="FolioSustitucion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Folio {

            @XmlAttribute(name = "UUID", required = true)
            protected String uuid;
            @XmlAttribute(name = "Motivo", required = true)
            protected String motivo;
            @XmlAttribute(name = "FolioSustitucion")
            protected String folioSustitucion;

            /**
             * Obtiene el valor de la propiedad uuid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUUID() {
                return uuid;
            }

            /**
             * Define el valor de la propiedad uuid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUUID(String value) {
                this.uuid = value;
            }

            /**
             * Obtiene el valor de la propiedad motivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMotivo() {
                return motivo;
            }

            /**
             * Define el valor de la propiedad motivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMotivo(String value) {
                this.motivo = value;
            }

            /**
             * Obtiene el valor de la propiedad folioSustitucion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFolioSustitucion() {
                return folioSustitucion;
            }

            /**
             * Define el valor de la propiedad folioSustitucion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFolioSustitucion(String value) {
                this.folioSustitucion = value;
            }

        }

    }

}
