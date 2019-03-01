package kingdom.earth;

import kingdom.Kingdom;
import kingdom.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KingdomApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Kingdom earthKingdom = context.getBean("kingdom", EarthKingdom.class);
        Knight knight = context.getBean("knight", Knight.class);
        earthKingdom.getPlanetNames().forEach(System.out::println);
        System.out.println(earthKingdom.getName());
        knight.saveKingdom();
        context.close();
    }
}
