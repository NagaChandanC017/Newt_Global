import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

       System.out.println( l1.indexOf(50));

        // for(int n:l1){
        //     System.out.println(n);
        // }
    }
}
