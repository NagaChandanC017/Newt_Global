class Car{
    public void drive(){
        System.out.println("max speed is 100...");
    }
    public void playMusic(){
                System.out.println("music is playing..");
    }
}

class InnerDemo{
    public static void main(String[] args){
        Car c1=new Car(){
            public void drive(){
                System.out.println("max speed is 200..");
            }
        };

        c1.drive();
        c1.playMusic();
    }
}