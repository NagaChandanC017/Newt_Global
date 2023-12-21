class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        char c1='a';
        while (c1<='j') {
            System.out.println(c1);
            c1++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        //t1.setPriority(10);
        t1.start();
        t2.start();
    }
}
