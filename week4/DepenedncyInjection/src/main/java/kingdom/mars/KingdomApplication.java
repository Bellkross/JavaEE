package kingdom.mars;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class KingdomApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MarsKingdom marsKingdom = context.getBean(MarsKingdom.class);
        marsKingdom.showPlanetNames();
        context.close();
    }
}
