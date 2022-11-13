package IO;
import java.io.*;
public class FileInput {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:\\Java IO\\filee.txt"); 
		int i = file.read();
		System.out.println((char)i);
		int j = 0;
		while((j=file.read())!=-1) {
			System.out.print((char)j);
		}
		/*for (int j = file.read(); j!=-1; j=file.read()) {
			System.out.print((char)j);
		}
        file.close();*/
	}
}
