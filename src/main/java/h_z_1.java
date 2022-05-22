import java.util.Arrays;

public class h_z_1 {
    public static void main (String[] agrs) {
        int[] num = {0, 1, 2, 3, 4, 5};
        int newnum = num[0];
        num[0] = num[5];
        num[5] = newnum;
        System.out.println(Arrays.toString(num));
    }
}
