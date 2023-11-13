import java.io.*;

class program2 {
    public static void main(String args[]) {
        File d = new File("path/");
        File f[] = d.listFiles();
        for (File obj : f) {
            if (obj.isFile() && obj.getName().endsWith(".txt")) {
                System.out.println(obj.getName());
            }
        }
    }
}
