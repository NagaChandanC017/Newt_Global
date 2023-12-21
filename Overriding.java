class Iphone11{
    public void call(){
        System.out.println("calling using 4g");
    }

    public void cemara(){
        System.out.println("using 30MPX");
    }
}

class Iphone12 extends Iphone11{
    public void call(){
        System.out.println("using 5g");
    }
}

class DemoMobile{
    public static void main(String[] arsg){
        Iphone12 i1=new Iphone12();
        i1.call();
        i1.cemara();
    }
}