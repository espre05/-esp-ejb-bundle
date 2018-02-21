
package esp.svc.calc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for calculateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputData" type="{http://calc.svc.esp/}inputData" minOccurs="0"/&gt;
 *         &lt;element name="statsOperation" type="{http://calc.svc.esp/}statisticalOperation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateRequest", propOrder = {
    "inputData",
    "statsOperation"
})
@XmlRootElement
public class CalculateRequest {

    protected InputData inputData;
    @XmlSchemaType(name = "string")
    protected StatisticalOperation statsOperation;

    /**
     * Gets the value of the inputData property.
     * 
     * @return
     *     possible object is
     *     {@link InputData }
     *     
     */
    public InputData getInputData() {
        return inputData;
    }

    /**
     * Sets the value of the inputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputData }
     *     
     */
    public void setInputData(InputData value) {
        this.inputData = value;
    }

    /**
     * Gets the value of the statsOperation property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticalOperation }
     *     
     */
    public StatisticalOperation getStatsOperation() {
        return statsOperation;
    }

    /**
     * Sets the value of the statsOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticalOperation }
     *     
     */
    public void setStatsOperation(StatisticalOperation value) {
        this.statsOperation = value;
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
