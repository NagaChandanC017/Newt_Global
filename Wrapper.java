public class Wrapper{
    public static void main(String[] args){
        int num1=10;
        Integer num2=20;
        System.out.println(num2);
        num2=num1;//boxing
        System.out.println(num2);
        Integer num3=30;
        num1=num3;//unboxing
        System.out.println(num1);
    }
}