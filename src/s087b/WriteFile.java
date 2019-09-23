package s087b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) {
		File f = new File("/tmp/values.txt");
		try {
			PrintWriter p = new PrintWriter(new FileWriter(f));
			p.println("12");
			p.println("47");
			p.println("5");
			p.flush();
			p.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
