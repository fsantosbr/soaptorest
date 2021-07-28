
package br.com.fsantosinfo.soaptorest.wsdl.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int intA;
    protected int intB;

    /**
     * Obtém o valor da propriedade intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Define o valor da propriedade intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Obtém o valor da propriedade intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Define o valor da propriedade intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
