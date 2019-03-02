package kingdom.solar;

import kingdom.Kingdom;
import kingdom.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SolarKingdomApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Kingdom solarKingdom = context.getBean(Kingdom.class);
        solarKingdom.getPlanetNames().forEach(System.out::println);
        Knight solarKnight = context.getBean(Knight.class);
        solarKnight.saveKingdom();
        context.close();
    }
}
