/**
 * Created by svetlanashmalko on 14.08.16.
 */
public class App01 {
    public static void main(String[] args) {
        Converter<Integer,String> converter=from->String.valueOf(from);
        String converted=converter.convert(123);
        System.out.println(converted);

    }
}
