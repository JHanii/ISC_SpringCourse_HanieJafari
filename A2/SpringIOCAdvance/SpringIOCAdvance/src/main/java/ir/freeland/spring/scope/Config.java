package ir.freeland.spring.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope("singleton")
    Person personSingleton() {
        return new Person();
    }

    @Bean
    @Scope("prototype")
    Person personPrototype() {
        return new Person();
    }
}
