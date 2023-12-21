class ExceptionDemo1{
    public static void main(String[] a){
        int i=0;
        int j=0;

        try{
            j=20/i;
            if(j==0)throw new ArithmeticException("j cannot be zero");
        }
        catch(ArithmeticException e){
            j=20;
            System.out.println("that the default valu "+e);
        }
        System.out.println(j);
    }
}