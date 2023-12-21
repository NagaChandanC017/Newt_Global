import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("thusday");
                break;

            case 3:
                System.out.println("wensday");
                break;

            case 4:
                System.out.println("Thusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("enter the valid number");
        }
    }
}