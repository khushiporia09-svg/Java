import java.util.Scanner;
public class conditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //  Example 1

//        System.out.println("enter your age: ");
//       int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("you are eligible to vote");
//        }else{
//            System.out.println("you are not eligible to vote");
//        }
       //  Example 2

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("given number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
