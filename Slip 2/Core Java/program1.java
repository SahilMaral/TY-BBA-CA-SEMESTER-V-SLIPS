import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.next();
        sc.close();
        System.out.print("Vowels in the given string are: ");
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U')
                System.out.print(ch + " ");
        }
    }
}
