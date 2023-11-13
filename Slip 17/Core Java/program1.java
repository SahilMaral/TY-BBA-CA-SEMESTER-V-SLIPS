import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> armstrongNumbers = new ArrayList<Integer>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isArmstrong(arr[i])) {
                armstrongNumbers.add(arr[i]);
            }
        }
        sc.close();
        System.out.print("The Armstrong numbers in the array are: ");
        for (int i = 0; i < armstrongNumbers.size(); i++) {
            System.out.print(armstrongNumbers.get(i) + " ");
        }
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return n == sum;
    }
}
