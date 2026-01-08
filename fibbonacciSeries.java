import java.util.Scanner;
public class fibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter Ending Number ");
        int n = sc.nextInt();
        System.out.print(a+" "+b);
        int res;
        for(int i = 0; i< n-2; i++){
            res = a + b;
            a = b;
            b = res;
            System.out.print(" "+res+" ");
        }

    }

}
