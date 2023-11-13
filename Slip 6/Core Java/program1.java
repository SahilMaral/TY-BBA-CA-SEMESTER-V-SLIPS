import java.util.*;

class program1 {
    static int sum(int no) {
        int last = 0, first = 0;
        last = no % 10;
        while (no > 9) {
            no /= 10;
        }
        first = no;
        int sum = first + last;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter a number: ");
        no = sc.nextInt();
        sc.close();
        try {
            if (no == 0) {
                throw new MyException();
            } else {
                System.out.print("Sum of First and last number is: " + program1.sum(no));
            }
        } catch (MyException obj) {
            System.out.print(obj.toString());
        }
    }
}

class MyException extends Exception {
    public String toString() {
        return "Exception: Number is Zero";
    }
}