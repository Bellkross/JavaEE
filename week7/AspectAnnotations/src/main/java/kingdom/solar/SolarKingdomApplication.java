package kingdom.solar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SolarKingdomApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SolarKingdom solarKingdom = context.getBean(SolarKingdom.class);
        solarKingdom.showPlanetNames();
        context.close();
    }
}
