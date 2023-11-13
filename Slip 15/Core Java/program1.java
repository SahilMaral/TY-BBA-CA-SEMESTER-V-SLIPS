class program1 {
    public static void main(String args[]) {
        String str[] = { "Sahil", "Tejas", "Aniket", "Pranesh", "Sunil" };
        String search = "Aniket";
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(search)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(search + " found at index " + index);
        } else {
            System.out.println(search + " not found in the array");
        }
    }
}
