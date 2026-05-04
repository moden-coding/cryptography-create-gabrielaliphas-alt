public class App {
    public static void main(String[] args) {
        String result = encode("caterpillar");
        System.out.println(result);
    }

    // 1.make empty
    // string
    // 2. for each loop
    // char at 1 and 2
    // substring last letter and return to the beginning
    // word length

    public static String encode(String word) {
        if (word.length() < 4) {
            return "";
        }
    
        char last = word.charAt(word.length() - 1);
        // last letter

        char one = word.charAt(0);
        char two = word.charAt(1);
        char three = word.charAt(2);

        // last, one, tree, two, rest of word start three, last -1

        return "" + last + one + three + two + word.substring(3, word.length() - 1);
    }

}
