class Lap{
    String model;
    int price;

    Lap(String model,int price){
        this.model=model;
        this.price=price;
    }

    public String toString(){
        return  model+" : "+price;
    }
}

class LapDemo{
    public static void main(String[] args){
        Lap ob1=new Lap("mac",100000);
        System.out.println(ob1);
    }
}