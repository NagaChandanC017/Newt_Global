public class Constractor {
    Constractor(){
        System.out.println("Con is running");
    }

    public void m1(){
        System.out.println("m1 is running");
    }

    public static void main(String[] args) {
        Constractor c1=new Constractor();
        Constractor c2=new Constractor();
        Constractor c3=new Constractor();
        Constractor c4=new Constractor();
        // c1.m1();
    }
}
