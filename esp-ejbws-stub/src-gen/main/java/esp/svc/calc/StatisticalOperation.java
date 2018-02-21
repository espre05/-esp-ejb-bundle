
package esp.svc.calc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticalOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statisticalOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUM"/&gt;
 *     &lt;enumeration value="AVERAGE"/&gt;
 *     &lt;enumeration value="MEAN"/&gt;
 *     &lt;enumeration value="MEDIAN"/&gt;
 *     &lt;enumeration value="MODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statisticalOperation")
@XmlEnum
public enum StatisticalOperation {

    SUM,
    AVERAGE,
    MEAN,
    MEDIAN,
    MODE;

    public String value() {
        return name();
    }

    public static StatisticalOperation fromValue(String v) {
        return valueOf(v);
    }

}
