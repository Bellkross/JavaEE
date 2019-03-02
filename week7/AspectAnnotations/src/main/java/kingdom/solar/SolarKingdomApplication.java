package kingdom.solar;

import kingdom.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SolarKingdomApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SolarKingdom solarKingdom = context.getBean(SolarKingdom.class);
        solarKingdom.getPlanetNames().forEach(System.out::println);
        Knight solarKnight = context.getBean(SolarKnight.class);
        solarKnight.saveKingdom();
        context.close();
    }
}
