import java.util.Scanner;

class program1 {
    int factorial(int n) {
        if (n <= 1) {
            return 1; 
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        program1 obj = new program1();
        System.out.println("The factorial of " + num + " is " + obj.factorial(num));      
    }
}
