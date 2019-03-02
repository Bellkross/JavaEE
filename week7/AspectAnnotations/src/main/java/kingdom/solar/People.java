package kingdom.solar;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class People {

    public static void sayGoodLuck() {
        System.out.println("Good luck, knight!");
    }

    public static void sayThankYou() {
        System.out.println("Thank you, knight!");
    }
}
