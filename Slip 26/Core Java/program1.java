import java.io.*;

class program1 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("filename.txt"));
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print(ch + " ");
        }
        reader.close();
    }
}
