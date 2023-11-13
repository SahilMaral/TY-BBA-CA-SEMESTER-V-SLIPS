import java.util.*;

class program1
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}