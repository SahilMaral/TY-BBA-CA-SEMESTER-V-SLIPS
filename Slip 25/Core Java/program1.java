import java.util.Scanner;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();
        String temp = str, rev = "";
        for (int i = temp.length()-1; i >= 0; i--) {
            rev += temp.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
