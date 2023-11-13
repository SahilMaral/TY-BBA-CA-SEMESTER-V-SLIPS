import java.util.*;

class program1 {
    public static void main(String args[]) {
        int no1, no2, ch = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1)Addtion");
            System.out.println("2)Substraction");
            System.out.println("3)Multiplication");
            System.out.println("4)Division");
            System.out.println("5)Exit");
            System.out.print("Enter your choise: ");
            ch = sc.nextInt();
            no1 = Integer.parseInt(args[0]);
            no2 = Integer.parseInt(args[1]);
            switch (ch) {
                case 1:
                    System.out.println("Addtion of two number are: " + (no1 + no2));
                    break;
                case 2:
                    System.out.println("Substraction of two number are: " + (no1 - no2));
                    break;
                case 3:
                    System.out.println("Multiplication of two number are: " + (no1 * no2));
                    break;
                case 4:
                    System.out.println("Division of two number are: " + (no1 / no2));
                    break;
            }
        } while (ch != 5);
        sc.close();
    }
}