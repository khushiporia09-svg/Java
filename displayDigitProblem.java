import java.util.Scanner;
public class displayDigitProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int r;
        int count =0;
        while(num>0){
            r = num%10;
            num = num/10;

            System.out.println("Digit: "+r);
            count++;
        }
        System.out.println("count is: "+count);

    }
}
