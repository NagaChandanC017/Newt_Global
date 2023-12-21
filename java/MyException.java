class NotFound extends RuntimeException{
    NotFound(String s){
        super(s);
    }

}

public class MyException {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        try{
            j=1/i;
            if(j==0)throw new NotFound("i dont want to be zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
