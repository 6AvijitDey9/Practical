package IO;
import java.io.ByteArrayInputStream;
import java.io.*;
public class ByteArray {

	public static void main(String[] args) throws Exception {
		byte[] array = {65, 66, 69, 71, 75};
		ByteArrayInputStream bais = new ByteArrayInputStream(array);
		int i =0;
		while((i = bais.read())!=-1) {
			System.out.println("The Byte/Ascii Value is: "+i+", Char value is: "+(char)i);
		}
		bais.close();
	}
}
