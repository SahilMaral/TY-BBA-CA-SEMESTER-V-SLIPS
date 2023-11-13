import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = scanner.nextInt();
        scanner.close();
        program1 obj = new program1();
        System.out.println("The sum of digits of is: " + obj.sod(no));
    }

    int sod(int no) {
        if (no == 0) {
            return 0;
        } else {
            return (no % 10) + sod(no / 10);
        }
    }
}
