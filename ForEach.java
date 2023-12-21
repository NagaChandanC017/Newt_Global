import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,4,2,9,7,10,9,6);

        // Consumer<Integer> con=new Consumer<Integer>() {
        //     public void accept(Integer t){
        //         System.out.println(t);
        //     }
        // };

        // nums.forEach(con);
        //Same process in lambda Exp

        nums.forEach((t)-> System.out.println(t));
    }
}
