import java.util.Scanner;
public class ArmStrongNumberProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int r;
        int sum = 0;
        int num1 = num;
        while(num>0){
            r = num % 10;
            num = num / 10;
            sum = sum + r*r*r;


        }
        if(sum==num1){
            System.out.println(sum+" is ArmStrong number");
        }else{
            System.out.println("Not an ArmStrong number");
        }

    }
}
