import java.util.*;

class program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String str = sc.next();
        sc.close();
        System.out.print("Hello, " + str.toUpperCase() + " ,nice to meet you!");
    }
}