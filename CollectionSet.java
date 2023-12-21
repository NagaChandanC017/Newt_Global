import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> c1=new HashSet<Integer>();

        c1.add(40);
        c1.add(30);
        c1.add(20);
        c1.add(10);
        c1.add(10);
        
       // System.out.println(c1);

        java.util.Iterator<Integer> i1=c1.iterator();
        
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
