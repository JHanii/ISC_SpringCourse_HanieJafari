package ir.freeland.spring.profile.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProductionDatasourceConfig implements DatasourceConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	
    @Override
    public void setup() {
        System.out.println("Setting up datasource for PRODUCTION environment. Driver is: " + driver );
    }

}
