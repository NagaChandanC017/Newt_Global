class Exp{
    public void show() throws ClassNotFoundException{
        Class.forName("Throws");
    }
}

public class Throws {

    static{
        System.out.println("class is loaded");
    }
    public static void main(String[] args) {
        Exp e1=new Exp();
        try {
            e1.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
