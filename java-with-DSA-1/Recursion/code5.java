import java.util.*;

public class code5 {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = fibo(n - 1);
        int fn2 = fibo(n - 2);
        int fn = fn1 + fn2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
        System.out.println();

    }
}
