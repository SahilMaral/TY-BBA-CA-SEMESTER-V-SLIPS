import java.io.*;

class program1 {
    public static void main(String args[]) throws IOException {
        File file = new File("text.txt");
        boolean hidden = file.isHidden();
        if (hidden) {
            System.out.println("The file is hidden.");
        } else {
            System.out.println("The file is not hidden.");
            System.out.println("The file path is: " + file.getAbsolutePath());
        }
    }
}
