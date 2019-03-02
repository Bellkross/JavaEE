package kingdom.solar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class People {

    @Before("kingdomSaving()")
    public static void sayGoodLuck() {
        System.out.println("People: Good luck, knight!");
    }

    @After("kingdomSaving()")
    public static void sayThankYou() {
        System.out.println("Thank you, knight!");
    }

    @Pointcut("execution(* kingdom.Knight.saveKingdom())")
    public void kingdomSaving() {
    }
}
