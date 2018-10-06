package academy.learnPrograming;

import static academy.learnPrograming.Config.printConfig;

/**
 * Created by balajakka on 06/10/2018.
 */
public class StaticImportsExample {
    public static void main(String[] args) {
        int min= Math.min(5,7);
        System.out.println("min="+min);
        System.out.println(Math.PI);

       printConfig();

    }
}
