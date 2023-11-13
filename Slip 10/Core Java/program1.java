import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int freq[] = new int[str.length()];
        char string[] = str.toCharArray();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their frequenceis: ");
        for (int i = 0; i < str.length(); i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " :: " + freq[i]);
            }
        }
    }
}