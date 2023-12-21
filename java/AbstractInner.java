abstract class Speaker{
    public abstract void play();
    public abstract void pass();
}

class AbstarctInner{
    public static void main(String[] a){
        Speaker s1=new Speaker(){
            public void play(){
                System.out.println("music is playing...");
            }

            public void pass(){
                System.out.println("music is passed....");
            }
        };
        s1.play();
        s1.pass();
    }
}