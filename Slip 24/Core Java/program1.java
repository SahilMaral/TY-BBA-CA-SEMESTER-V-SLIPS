import java.io.*;

class program1 {
    public static void main(String args[]) throws IOException {
        File file = new File("sample.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int ch, digitCount = 0, spaceCount = 0, charCount = 0;
        while ((ch = reader.read()) != -1) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                charCount++;
            }
        }
        reader.close();
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of characters: " + charCount);
    }
}