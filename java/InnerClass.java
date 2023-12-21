class A{
    int x;
    public void show(){
        System.out.println("in show...");
    }

    class B{
        public void config(){
            System.out.println("config in class b......");
        }
    }

    static class C{
        public void config(){
            System.out.println("config in c.....");
        }
    }
}

class InnerClass{
    public static void main(String[] a){
        A a1= new A();
        a1.show();
        A.B b1=a1.new B();
        b1.config();
        A.C c1=new A.C();
        c1.config();
    }
}