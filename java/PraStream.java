import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PraStream {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(10000);

        Random r1=new Random();
        for(int i=1;i<=10000;i++){
            l1.add(r1.nextInt(100));
        }

        long time1st=System.currentTimeMillis();
        int res=l1.stream().map(i->i*2).mapToInt(i->i).sum();
        long time1ed=System.currentTimeMillis();

        long time2st=System.currentTimeMillis();
        int res1=l1.parallelStream().map(i->i*2).mapToInt(i->i).sum();
        long time2ed=System.currentTimeMillis();

        System.out.println(res+" time: "+(time1ed-time1st));
        System.out.println(res1+" time: "+(time2ed-time2st));
    }
}
