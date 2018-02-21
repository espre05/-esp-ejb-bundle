package esp.ws.client.sboot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class AppWsClientConfiguration {

  @Value("${ejbws.uri.calc}")
  private String calcUri;

//  @Bean
//  Jaxb2Marshaller jaxb2Marshaller() {
//    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
//    jaxb2Marshaller.setContextPath("com.codenotfound.types.helloworld");
//    return jaxb2Marshaller;
//  }

  
  
  @Bean(name="calcWsTemplate")
  public WebServiceTemplate calcWebServiceTemplate() {
    WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    jaxb2Marshaller.setContextPath("esp.svc.calc");
    webServiceTemplate.setMarshaller(jaxb2Marshaller);
    webServiceTemplate.setUnmarshaller(jaxb2Marshaller);
    webServiceTemplate.setDefaultUri(calcUri);

    return webServiceTemplate;
  }

  @Value("${ejbws.uri.hello}")
  private String helloUri;
  
  @Bean(name="helloWsTemplate")
  public WebServiceTemplate helloWebserviceTemplate() {
	  WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
	    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
	    jaxb2Marshaller.setContextPath("esp.svc.hello");
	    webServiceTemplate.setMarshaller(jaxb2Marshaller);
	    webServiceTemplate.setUnmarshaller(jaxb2Marshaller);    webServiceTemplate.setDefaultUri(calcUri);

    return webServiceTemplate;
  }

}