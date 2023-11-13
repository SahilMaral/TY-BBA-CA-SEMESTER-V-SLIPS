import java.util.*;

class MyException extends Exception {
    public String toString() {
        return "Number is Zero";
    }
}

class MyException1 extends Exception {
    public String toString() {
        return "Number is is Invalid";
    }
}

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String no = sc.next();
        sc.close();
        try {
            if (Integer.parseInt(no) == 0) {
                throw new MyException();
            } else if (Integer.parseInt(no) > 0) {
                int rem, sum = 0, temp = Integer.parseInt(no), no1 = temp;
                while (no1 > 0) {
                    rem = no1 % 10;
                    sum = sum * 10 + rem;
                    no1 /= 10;
                }
                if (temp == sum) {
                    System.err.println("Number is palindrome");
                } else {
                    System.out.println("Number is not palindrome");
                }
            } else {
                throw new MyException1();
            }
        } catch (MyException e) {
            System.out.println(e.toString());
        } catch (MyException1 e1) {
            System.out.println(e1.toString());
        }
    }
}
