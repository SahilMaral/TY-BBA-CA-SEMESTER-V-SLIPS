import java.util.Scanner;

class program1 {
    static int isArmstrong(int number) {
        int sum = 0, no = number, rem;
        while (no > 0) {
            rem = no % 10;
            sum = sum + rem * rem * rem;
            no = no / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isArmstrong(number) == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
