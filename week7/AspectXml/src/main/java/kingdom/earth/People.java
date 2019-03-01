package kingdom.earth;

import kingdom.Knight;

public class People {

    public static void sayGoodLuck(Knight knight) {
        System.out.println(String.format("Good luck, %s!", knight.getName()));
    }

    public static void sayThankYou(Knight knight) {
        System.out.println(String.format("Thank you, %s!", knight.getName()));
    }
}
