package ir.freeland.spring.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CountryClientConfig {

    @Bean
    Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("ir.freeland.spring.object");
            return marshaller;
    }

    @Bean
    CountryClient countryClient(Jaxb2Marshaller marshaller) {
            CountryClient client = new CountryClient();
            client.setDefaultUri("http://localhost:8080/ws");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
    }
}