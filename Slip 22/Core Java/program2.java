import java.io.*;

class program2 {
    public static void main(String args[]) throws IOException {
        File file = new File("test.txt");
        boolean created = file.createNewFile();
        if (created) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
        File newFile = new File("newtest.txt");
        boolean renamed = file.renameTo(newFile);
        if (renamed) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Failed to rename file");
        }
        boolean deleted = newFile.delete();
        if (deleted) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete file");
        }
        String path = file.getPath();
        System.out.println("The path of the file is: " + path);
    }
}
