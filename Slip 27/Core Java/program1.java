import java.util.*;

class MyException extends Exception {
    public String toString() {
        return "Number is out of Range";
    }
}

class program1 {
    static void Factors(int n) {
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        try {
            if (n >= 1000) {
                throw new MyException();
            } else {
                program1.Factors(n);
            }
        } catch (MyException obj) {
            System.out.println(obj.toString());
        }
    }
}
