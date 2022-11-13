package IO;
import java.io.*;

public class BufferedOutput {

	public static void main(String[] args) {
		try {
		FileOutputStream file = new FileOutputStream("E:\\Java IO\\fileeBuffered.txt");
        BufferedOutputStream bos = new BufferedOutputStream(file);
        String str = "Line created by BufferedOutputStream";
        byte b[] = str.getBytes();
        bos.write(b);
        System.out.println("BufferedOutputStream Process Done");
        bos.close();  
	}
	catch(Exception e) {
		System.out.println(e);
	}}}
