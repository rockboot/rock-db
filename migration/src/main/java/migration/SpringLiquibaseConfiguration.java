package migration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "rock.migration.enable", havingValue = "true", matchIfMissing = false)
public class SpringLiquibaseConfiguration {

//    @Bean
//    public SpringLiquibase springLiquibase(){
//        return new SpringLiquibase();
//    }
}
