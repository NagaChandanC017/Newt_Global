import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("naga","chandan","jathin","harika");

        Optional<String> res=names.stream().filter(str->str.contains("z")).findFirst();

        System.out.println(res.orElse("Not found"));
    }
}
