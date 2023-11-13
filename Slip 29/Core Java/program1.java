import java.util.*;

class MyException extends Exception {
    public String toString() {
        return "You are not eligible for voting.";
    }
}

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        try {
            if (age <= 18) {
                throw new MyException();
            } else {
                System.out.println("You are eligible for voting.");
            }
        } catch (MyException obj) {
            System.out.println(obj.toString());
        }
    }
}
