import java.util.Scanner;
class demo{
    public static void main(String args[]){
        System.out.println("Enter SIZE");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size){
            case 29:
            System.out.println(" SMALL ");
            break;
            case 30:
            System.out.println(" MEDIUM ");
            break;
            case 38:
            System.out.println(" LARGE ");
            break;
            case 42:
            System.out.println(" XLARGE ");
            break;
            default:
            System.out.println(" SIZE IS INVALID");
        }
        }
}