package may_25;

public class CL {
    public static void main (String[] agrs){
        int a = 10;
        int b = 2;
                a += 12;
                b -= 11;
                int c = --a - ++b;
                boolean q = a == b;
                boolean w = a <= b;
                boolean e = a != b;
                boolean r = a >= b;
        boolean t = e && r;
        boolean y = q? w : e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
    }
}

