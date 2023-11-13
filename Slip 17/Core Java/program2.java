import java.util.*;

class Product {
    private int pid;
    private String pname;
    private double price;
    private int qty;

    Product(int pid, String pname, double price, int qty) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.qty = qty;
    }

    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
    }

    public double calculate() {
        return price * qty;
    }
}

class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Product Name: ");
            String pname = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            products[i] = new Product(pid, pname, price, qty);
        }
        sc.close();
        System.out.println("The product details are:");
        for (int i = 0; i < n; i++) {
            products[i].display();
            System.out.println();
        }
        double totalAmount = 0;
        for (int i = 0; i < n; i++) {
            totalAmount += products[i].calculate();
        }
        System.out.println("The total amount is: " + totalAmount);
    }
}