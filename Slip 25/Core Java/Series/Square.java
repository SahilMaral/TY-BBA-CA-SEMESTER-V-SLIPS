package Series;

public class Square {
    public static void printSeries(int n) {
        System.out.print("Square of numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
}
