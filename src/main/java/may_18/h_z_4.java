package may_18;

public class h_z_4 {
    public static void main (String[] agrs){
     int[] num = {1, 2, 3, 4, 5};
     int sum = 0;
     for (int sum1 : num)
         sum = sum + sum1;
     int averege = sum / num.length;
     System.out.println(averege);
    }
}
