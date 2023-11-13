package Series;

public class Fibonacci {
    public static void printSeries(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci series: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}