package kingdom.earth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KingdomApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EarthKingdom earthKingdom = context.getBean(EarthKingdom.class);
        earthKingdom.showPlanetNames();
        context.close();
    }
}
