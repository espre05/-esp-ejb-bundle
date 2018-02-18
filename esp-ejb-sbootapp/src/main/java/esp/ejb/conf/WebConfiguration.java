package esp.ejb.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
//@EnableSwagger2
class WebConfiguration {

//	@Bean
//	public Docket bpappApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("bpcs").apiInfo(bpappApiInfo()).select()
//				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
//	}
//
//	private ApiInfo bpappApiInfo() {
//		return new ApiInfoBuilder().title("Swagger REST").description("Swagger api docs").contact("Prem Natarajan")
//				.version("1.0").build();
//	}

	@Bean
    public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("esp.ejb.ws.calc");
		return marshaller;
	}

	@Value("${esb-ejb-ws.soap-uri.Calculator}")
	private String calculatorSoapUri;
	
	@Bean
	public WebServiceTemplate webServiceTemplate() {
	    WebServiceTemplate template = new WebServiceTemplate();
	    template.setDefaultUri(calculatorSoapUri);
	    template.setMarshaller(marshaller());
	    template.setUnmarshaller(marshaller());
	    return template;
	}
}
