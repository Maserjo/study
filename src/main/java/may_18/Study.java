package may_18;

public class Study {

    public static void main(String[] agrs) {
        String word = "home";
        String newWord =
                word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1) + word.substring(word.length() - 1).toUpperCase();
        System.out.println(newWord);
    }
}