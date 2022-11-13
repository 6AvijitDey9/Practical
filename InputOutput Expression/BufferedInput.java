package IO;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInput {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:\\Java IO\\filee.txt"); 
        BufferedInputStream bis = new BufferedInputStream(file);
        for(int i=bis.read(); i!=-1; i=bis.read()) {
        	System.out.print((char)i);
        }
        bis.close();
	}
}
