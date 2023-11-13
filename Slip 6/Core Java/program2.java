import java.util.*;

class program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter a number of columns: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element at index :[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Real Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}