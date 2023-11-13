class program1 {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
                Integer.parseInt(args[i]);
                count++;
        }
        System.out.println("Number of integers: " + count);
    }
}
