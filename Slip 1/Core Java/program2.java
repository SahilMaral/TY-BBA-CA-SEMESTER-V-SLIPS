import java.io.*;

class program2 {
	public static void main(String args[]) throws Exception {

		FileReader r = new FileReader("file1.txt");
		FileWriter w = new FileWriter("Copydata.txt");
		int data = r.read();
		while (data != -1) {
			String content = String.valueOf((char) data);
			if (Character.isAlphabetic(data))
				w.write(content);
			else if (content.equals(" "))
				w.write(content);
			data = r.read();
		}
		System.out.println("file copy successfully....");
		r.close();
		w.close();
	}
}
