package IO;
import java.io.*;
public class FileRead {

	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("E:\\Java IO\\fileWriter.txt"); 
		int j = 0;
		while((j=file.read())!=-1) {
			System.out.print((char)j);
		}
	}
}
