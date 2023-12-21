import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(10,2,34,75,3,4);
        Stream<Integer> s1=l1.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);

        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
        //s3.forEach(n->System.out.println(n));
    }
}
