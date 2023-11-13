import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a coiefficient: ");
        int cof = sc.nextInt();
        System.out.print("Enter a exponent: ");
        int exp = sc.nextInt();
        sc.close();
        program1 obj = new program1();
        System.out.print("Power is " + obj.power(cof, exp));
    }

    int power(int cof, int exp) {
        int sum = 1;
        if (exp == 0) {
            return 1;
        } else {
            sum = cof * power(cof, exp - 1);
        }
        return sum;
    }
}