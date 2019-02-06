package kingdom.mars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
class AppConfig {
    @Bean
    public Mars getPlanet() {
        Mars mars = new Mars();
        mars.setName("Mars");
        return mars;
    }
}
