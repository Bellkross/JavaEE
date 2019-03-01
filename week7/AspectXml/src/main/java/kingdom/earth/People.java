package kingdom.earth;

import kingdom.Knight;
import org.springframework.beans.factory.annotation.Autowired;

public class People {

    public static void sayGoodLuck() {
        System.out.println("Good luck, knight!");
    }

    @Autowired
    public static void sayThankYou() {
        System.out.println("Thank you, knight!");
    }
}
