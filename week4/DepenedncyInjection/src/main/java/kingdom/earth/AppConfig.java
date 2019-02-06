package kingdom.earth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
class AppConfig {

    @Bean
    public Earth getPlanet() {
        return new Earth("Earth");
    }

}