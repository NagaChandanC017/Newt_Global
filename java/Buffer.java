import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader is=new InputStreamReader(System.in) ;
        BufferedReader bf=new BufferedReader(is);
        
        System.out.println("enter the number");
        int num=Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
    }
}
