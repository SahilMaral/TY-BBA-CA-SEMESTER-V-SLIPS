class program1 {
    public static void main(String args[]) {
        int no = 5;
        for (int i = no; i > 0; i--) {
            for (int j = i; j <= no; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}