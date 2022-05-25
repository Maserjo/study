package may_25;

import java.lang.reflect.Array;
import java.util.Collections;

public class CL2 {

        public static void main (String[] agrs){
            int a = 6;
            int a1 = a + 1;
            String q = "*";
            for (int i = a-1; i >= 0; i-- )

                System.out.println(String.join(" ", Collections.nCopies(a1 -=1,q)));

        }

}
