public class RunnableIF {
    public static void main(String[] args) {
       Runnable r1=() ->{
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       };

       Runnable r2=() ->{
        char c1='a';
        while(c1<='e'){
            System.out.println(c1);
            c1++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       };

       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);

       t1.start();
       t2.start();
    }
}
