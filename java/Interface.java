interface Bike{
    public default void drive(){
        System.out.println("bike is driving");
    }

    void noGares();
}

class Honda implements Bike{
    public void noGares(){
        System.out.println("we have 5 gares...");
    }
}

class InterfaceDemo{
    public static void main(String[] a){
        Bike b1=new Honda();
        b1.drive();
        b1.noGares();
    }
}