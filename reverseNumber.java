import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int r;
        int rev = 0;
        int num1 = num;
        while(num>0){
            r = num%10;
            num = num/10;
            rev = rev*10+r;
        }
        System.out.println(rev);
        if(rev==num1){  // number palindrome , number checker
            System.out.println("its a reverse number");
        }else{
            System.out.println("not a reverse number");
        }
    }
}
