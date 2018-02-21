package esp.svc.impl.ejb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import esp.svc.hello.HelloService;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-02-19T10:10:18.629-05:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "HelloBeanService", 
                  wsdlLocation = "file:/D:/pers_proj/esp-ejb-bundle/esp-ejbws-stub/src/main/resources/ejbws-wsdl/openejb/HelloBean_ejbws_openejb.wsdl",
                  targetNamespace = "http://ejb.impl.svc.esp/") 
public class HelloBeanService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ejb.impl.svc.esp/", "HelloBeanService");
    public final static QName HelloServicePort = new QName("http://ejb.impl.svc.esp/", "HelloServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/pers_proj/esp-ejb-bundle/esp-ejbws-stub/src/main/resources/ejbws-wsdl/openejb/HelloBean_ejbws_openejb.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloBeanService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/pers_proj/esp-ejb-bundle/esp-ejbws-stub/src/main/resources/ejbws-wsdl/openejb/HelloBean_ejbws_openejb.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloBeanService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloBeanService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloBeanService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort() {
        return super.getPort(HelloServicePort, HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloService getHelloServicePort(WebServiceFeature... features) {
        return super.getPort(HelloServicePort, HelloService.class, features);
    }

}
