public class h_z_2 {
    public static void main (String[] agrs) {
    double[] num = {1.5, 2.0, 3.5};
    double sum = 0;
    for (double sum1 : num)
        sum = sum + sum1;
    double mult = 1;
    for (double mult1 : num)
            mult = mult * mult1;

    double averege = sum / num.length;

    System.out.println(
            "Сумма - " + sum + " Произведение - " + mult + " Среднее - " + averege);


    }
}
