import java.io.*;

class program2 {
    public static void main(String args[]) throws Exception {
        for (int i = 0; i < args.length; i++) {
            File f = new File(args[i]);
            if (f.isFile()) {
                String name = f.getName();
                if (name.endsWith(".txt")) {
                    f.delete();
                    System.out.print("File is deleted: " + f);
                } else {
                    System.out.print("File name: " + name + "\nFile Location:  " + f.getAbsolutePath() + "\nFile size: "
                            + f.length() + "bytes");
                }
            }
        }
    }
}