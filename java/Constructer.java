class Circle{
    int radus;
    Circle(int radus){
        this.radus=radus;
    }
}

class Insl{
    public static void main(String[] args){
        Circle c1=new Circle(10);
        System.out.println(c1.radus);
    }
}