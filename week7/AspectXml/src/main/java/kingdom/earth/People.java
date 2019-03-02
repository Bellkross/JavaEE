package kingdom.earth;

import kingdom.Knight;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

public class People {

    public static void sayGoodLuck() {
        System.out.println("People: Good luck, knight!");
    }

    public static void sayThankYou() {
        System.out.println("People: Thank you, knight!");
    }
}
