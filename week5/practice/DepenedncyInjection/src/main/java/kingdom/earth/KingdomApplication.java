package kingdom.earth;

import kingdom.Kingdom;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KingdomApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Kingdom earthKingdom = context.getBean("kingdom", EarthKingdom.class);
        earthKingdom.showPlanetNames();
        context.close();
    }
}
