
package esp.svc.calc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esp.svc.calc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Calculate_QNAME = new QName("http://calc.svc.esp/", "calculate");
    private final static QName _CalculateResponse_QNAME = new QName("http://calc.svc.esp/", "calculateResponse");
    private final static QName _CalculatorException_QNAME = new QName("http://calc.svc.esp/", "CalculatorException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esp.svc.calc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculate }
     * 
     */
    public Calculate createCalculate() {
        return new Calculate();
    }

    /**
     * Create an instance of {@link CalculateResponse }
     * 
     */
    public CalculateResponse createCalculateResponse() {
        return new CalculateResponse();
    }

    /**
     * Create an instance of {@link CalculatorException }
     * 
     */
    public CalculatorException createCalculatorException() {
        return new CalculatorException();
    }

    /**
     * Create an instance of {@link CalculateRequest }
     * 
     */
    public CalculateRequest createCalculateRequest() {
        return new CalculateRequest();
    }

    /**
     * Create an instance of {@link InputData }
     * 
     */
    public InputData createInputData() {
        return new InputData();
    }

    /**
     * Create an instance of {@link CalculateResult }
     * 
     */
    public CalculateResult createCalculateResult() {
        return new CalculateResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.svc.esp/", name = "calculate")
    public JAXBElement<Calculate> createCalculate(Calculate value) {
        return new JAXBElement<Calculate>(_Calculate_QNAME, Calculate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.svc.esp/", name = "calculateResponse")
    public JAXBElement<CalculateResponse> createCalculateResponse(CalculateResponse value) {
        return new JAXBElement<CalculateResponse>(_CalculateResponse_QNAME, CalculateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatorException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.svc.esp/", name = "CalculatorException")
    public JAXBElement<CalculatorException> createCalculatorException(CalculatorException value) {
        return new JAXBElement<CalculatorException>(_CalculatorException_QNAME, CalculatorException.class, null, value);
    }

}
