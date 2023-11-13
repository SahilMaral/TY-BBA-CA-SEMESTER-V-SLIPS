import java.util.Scanner;

class program2 {
    String name;
    static int count = 0;

    program2(String name) {
        this.name = name;
        count++;
    }

    static void sort(program2 obj[]) {
        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                if (obj[i].name.compareTo(obj[j].name) > 0) {
                    program2 temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int no = scanner.nextInt();
        program2[] obj = new program2[no];
        // scanner.nextLine();
        for (int i = 0; i < no; i++) {
            System.out.print("Enter the name of employee: ");
            String name = scanner.next();
            obj[i] = new program2(name);
        }
        scanner.close();
        sort(obj);
        System.out.println("The names of employees in alphabetical order are:");
        for (int i = 0; i < no; i++) {
            System.out.println(obj[i].name);
        }
    }
}
