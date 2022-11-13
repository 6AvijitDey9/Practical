package IO;
import java.io.*;
public class FileOutput {

	public static void main(String[] args) {
		try {
		FileOutputStream file = new FileOutputStream("E:\\Java IO\\filee.txt");
        String str = "Line created by fileOutputStream";
        byte b[]=str.getBytes();
        file.write(b);
        file.close();
        System.out.println("Done");
	}
		catch(Exception e) {
			System.out.println(e);
		}}}
