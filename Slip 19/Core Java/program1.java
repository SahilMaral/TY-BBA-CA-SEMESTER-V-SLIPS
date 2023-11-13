class program1 {
    public static void main(String args[]) {
        int n = 12;
        System.out.print("Fibonacci series:");
        program1 obj = new program1();
        obj.fibonacci(n);
    }

    void fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int i = 2; i < n; i++)
        {
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
