package kingdom.earth;

import kingdom.Knight;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class People {

    @Pointcut("execution(* kingdom.Knight.saveKingdom(..))")
    public void kingdomSaving() {}

    @Before("kingdomSaving()")
    public static void sayGoodLuck() {
        System.out.println("People: Good luck, knight!");
    }

    @After("kingdomSaving()")
    public static void sayThankYou() {
        System.out.println("People: Thank you, knight!");
    }
}
