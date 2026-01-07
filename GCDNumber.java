import java.util.Scanner;
public class GCDNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
        int num = a;
        int num1 = b;
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        System.out.println("GCD of "+num+" and "+num1+" is "+a);
    }
}
