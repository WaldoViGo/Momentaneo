
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abonar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abonar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcliente2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="montoabonar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abonar", propOrder = {
    "idcliente2",
    "montoabonar"
})
public class Abonar {

    protected int idcliente2;
    protected int montoabonar;

    /**
     * Obtiene el valor de la propiedad idcliente2.
     * 
     */
    public int getIdcliente2() {
        return idcliente2;
    }

    /**
     * Define el valor de la propiedad idcliente2.
     * 
     */
    public void setIdcliente2(int value) {
        this.idcliente2 = value;
    }

    /**
     * Obtiene el valor de la propiedad montoabonar.
     * 
     */
    public int getMontoabonar() {
        return montoabonar;
    }

    /**
     * Define el valor de la propiedad montoabonar.
     * 
     */
    public void setMontoabonar(int value) {
        this.montoabonar = value;
    }

}
