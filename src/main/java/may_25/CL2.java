package may_25;

import java.util.Collections;

public class CL2 {

        public static void main (String[] agrs){
            int a = 5;
            int a1 = a + 1;
            String q = "*";
            for (int i = a-1; i >= 0; i-- )

                System.out.println(Collections.nCopies(a1 -=1,q));

        }

}
