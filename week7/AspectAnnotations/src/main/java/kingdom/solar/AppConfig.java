package kingdom.solar;

import kingdom.Planet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

    @Bean
    ArrayList<Planet> getPlanets() {
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Neptune("Neptune"));
        planets.add(new Jupiter("Jupiter"));
        return planets;
    }

    @Bean
    String getSolarKingdomName() {
        return "Solar Star";
    }

}
