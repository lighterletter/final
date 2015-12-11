package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     * <p/>
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        // TODO: Write this method.

        String vowels[] = {"a", "e", "i", "o", "u"};

        for (String letter : vowels) {

            string = string.replace(letter, "");

        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
