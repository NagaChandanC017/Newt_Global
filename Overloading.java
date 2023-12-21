class Calculater{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class Overloading{
    public static void main(String[] args){
        Calculater c1=new Calculater();
        System.out.println(c1.add(2,4));
        System.out.println(c1.add(3,4,5));
    }
}