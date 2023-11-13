class program1 {
    public static void main(String args[]) {
        String input = "Hello World";
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
