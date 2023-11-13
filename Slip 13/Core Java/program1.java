import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array element: ");
        int no = sc.nextInt();
        ArrayList<String> list = new ArrayList<>(no);
        for (int i = 0; i < no; i++) {
            System.out.print("Enter element of arraylist: ");
            String str = sc.next();
            list.add(str);
        }
        sc.close();
        System.out.println("Arraylist are: ");
        System.out.println(list);
        System.out.println("Arraylist in reversed are: ");
        Collections.reverse(list);
        System.out.println(list);

    }
}