import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String,Integer> m1=new Hashtable<String,Integer>();

        m1.put("naga", 99);
        m1.put("chandan", 89);
        m1.put("jathin", 98);
        m1.put("harika", 99);

        System.out.println(m1);
        

        for(String key: m1.keySet()){
            System.out.println(key+" : "+m1.get(key));
        }

        for(int n:m1.values()){
            System.out.println(n);
        }

    }
}
