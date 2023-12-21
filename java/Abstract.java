abstract class car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("music palying....");
    }
}

class Bmw extends car{
    public void drive(){
        System.out.println("BMW is driving...");
    }

}

class CarDemo{
    public static void main(String[] a){
        Bmw b1=new Bmw();
        b1.drive();
        b1.playMusic();
    }
}