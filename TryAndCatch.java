class ExceptionDemo{
    public static void main(String[] a){
        int i=2;
        int j=0;

        int[] arr=new int[5];
        String str=null;
        try{
             j=18/i;
             System.out.println(arr[2]);
             System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("can not divide with 0....");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("given index is out of boundede.....");
        }
        catch(Exception e){
            System.out.println("some thing went wrong...."+e);
        }

        System.out.println(j);
    }
}