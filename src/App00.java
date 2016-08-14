import static java.util.Arrays.asList;

/**
 * Created by svetlanashmalko on 14.08.16.
 */
public class App00 {
    public static void main(String[] args) {
        asList("A","BB","CCC").stream()
                .filter(s->s.length()>1)
                .map(String::length)
                .forEach(System.out::println);

    }
}
