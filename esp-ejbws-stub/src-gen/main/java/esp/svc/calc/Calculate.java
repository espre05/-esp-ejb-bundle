
package esp.svc.calc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for calculate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculateRequest" type="{http://calc.svc.esp/}calculateRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculate", propOrder = {
    "calculateRequest"
})
//@XmlRootElement
public class Calculate {

    @XmlElement(required = true)
    protected CalculateRequest calculateRequest;

    /**
     * Gets the value of the calculateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateRequest }
     *     
     */
    public CalculateRequest getCalculateRequest() {
        return calculateRequest;
    }

    /**
     * Sets the value of the calculateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateRequest }
     *     
     */
    public void setCalculateRequest(CalculateRequest value) {
        this.calculateRequest = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
