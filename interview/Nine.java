package interview;
import java.util.stream.Stream;
import java.util.Optional;

public class Nine {
    public static void main(String[] args) {
        Stream.of("eeny", "meeny", null).forEach(StringToUpper::toUpper);
    }

    private static void ToUpper(String str) {
        Optional<String> string = Optional.ofNullable(str);
        System.out.print(String.map(String::toUpperCase).orElse("dummy"));
    }
}