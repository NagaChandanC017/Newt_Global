enum Status{
    Running,Pending,Success,Fail;
}

class EnumDemo{
    public static void main(String[] a){
        Status s=Status.Fail;

        switch(s){
            case Running:
                System.out.println("wait.....");
                break;
            
            case Pending:
                System.out.println("take time....");
                break;

            case Fail:
                System.out.println("failed...");
                break;

            case Success:
                System.out.println("done.....");
                break;
        }

        Status[] arr=Status.values();
        for(Status x:arr){
            System.out.println(x);
        }
    }
}