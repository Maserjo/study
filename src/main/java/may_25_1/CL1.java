package may_25_1;

public class CL1 {
    public static void main (String[] agrs){
        System.out.println(maxvalue(12, 14, 1));

    }
    public static int maxvalue (int a, int b, int c){
        int max;
        if (a > b && a > c)
            max = a;
        else
            if (b > a && b > c)
                max = b;
        else max = c;
        return max;


    }

}
