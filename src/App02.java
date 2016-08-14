import static java.util.Arrays.asList;

/**
 * Created by svetlanashmalko on 14.08.16.
 */
public class App02 {
    public static void main(String[] args) {
        System.out.println( asList(1,2,3,4,5,6,7,8,6,4,3,2).stream()
                .max(Integer::compareTo).get());
        System.out.println("----------------------------");


        asList(1,2,3,4,5,6,7,8,6,4,3,2).stream()
                .filter((s)->s>2)
                .forEach(System.out::println);

        System.out.println("----------------------------");

        System.out.println(asList(1,2,3,4,5,6,7,8,6,4,3,2).stream()
                .sorted()
                .reduce((s1, s2) -> s1 + s2));

    }

}
