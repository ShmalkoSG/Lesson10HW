/**
 * Created by svetlanashmalko on 14.08.16.
 */
@FunctionalInterface
interface Converter<F,T> {
    T convert(F from);
}
