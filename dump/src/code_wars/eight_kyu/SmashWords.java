package code_wars.eight_kyu;

public class SmashWords {
    public static String smash(String... words) {
               //Arrays.asList(words).stream().collect(Collectors.joining(" "));
        return String.join(" ", words);
    }
}
