import java.io.*;

class program2 {
    public static void main(String[] args) throws IOException {
        File input = new File("original.txt");
        File output = new File("copydata.txt");

        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        String str;
        while ((str = reader.readLine()) != null) {
            String change = str.replaceAll("\\d", "*");
            writer.write(change);
            writer.newLine();
        }
        reader.close();
        writer.close();
        System.out.println("File copied successfully.");
    }
}
