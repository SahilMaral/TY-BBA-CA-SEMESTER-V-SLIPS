import java.io.*;

class program1 {
    public static void main(String args[]) throws IOException {
        File file = new File("read.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String words[] = line.split("\\s+");
            for (int i = words.length - 1; i >= 0; i--) {
                StringBuilder read = new StringBuilder(words[i]);
                read.reverse();
                System.out.print(read + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
