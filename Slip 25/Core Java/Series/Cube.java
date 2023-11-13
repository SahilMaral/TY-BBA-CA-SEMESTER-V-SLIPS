package Series;

public class Cube {
    public static void printSeries(int n) {
        System.out.print("Cube of numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * i + " ");
        }
        System.out.println();
    }
}
