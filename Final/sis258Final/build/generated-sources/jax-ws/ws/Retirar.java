
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retirar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retirar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcliente1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="montoretirar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retirar", propOrder = {
    "idcliente1",
    "montoretirar"
})
public class Retirar {

    protected int idcliente1;
    protected int montoretirar;

    /**
     * Obtiene el valor de la propiedad idcliente1.
     * 
     */
    public int getIdcliente1() {
        return idcliente1;
    }

    /**
     * Define el valor de la propiedad idcliente1.
     * 
     */
    public void setIdcliente1(int value) {
        this.idcliente1 = value;
    }

    /**
     * Obtiene el valor de la propiedad montoretirar.
     * 
     */
    public int getMontoretirar() {
        return montoretirar;
    }

    /**
     * Define el valor de la propiedad montoretirar.
     * 
     */
    public void setMontoretirar(int value) {
        this.montoretirar = value;
    }

}
