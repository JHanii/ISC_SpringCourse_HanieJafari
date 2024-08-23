package ir.freeland.spring.profile.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceConfig implements DatasourceConfig {

	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	
    @Override
    public void setup() {
        System.out.println("Setting up datasource for DEV environment. Driver is: " + driver );
    }

}
