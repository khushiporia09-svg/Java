import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
         // conditional for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
//        int sum = 0;
//        for(int i = 0; i<=num; i++){
//            sum = sum + i;
//
//        }
//        System.out.println("sum is = "+sum);


//    int mult;
//    for(int i = 1; i<=10; i++ ){
//        mult = num * i;
//        System.out.println(mult);
//    }
        int fact = 1;
        for(int i =1; i <=num; i++){
            fact = fact*i;
        }
        System.out.println("factorial of number is : "+fact);
    }
}
