class Cla{
    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }
}

class AvdCal extends Cla{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

class VeryAvd extends AvdCal{
    public int rem(int a,int b){
        return a%b;
    }
}

class Demo{
    public static void main(String[] args){
        VeryAvd ac=new VeryAvd();
        System.out.println(ac.add(10,20));
        System.out.println(ac.sub(10,20));
        System.out.println(ac.mul(10,20));
        System.out.println(ac.div(10,20));
        System.out.println(ac.rem(10,20));
    }
}