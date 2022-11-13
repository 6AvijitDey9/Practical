package IO;
import java.io.*;
public class ByteArrayOp {

	public static void main(String[] args) {
      try {
    	  FileOutputStream file = new FileOutputStream("E:\\Java IO\\ByteArray.txt");
    	  ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	  String str = "This line is created by ByteArrayOutputStream";
    	  byte b[] = str.getBytes();
    	  bos.write(b);
    	  bos.writeTo(file);
    	  bos.close();
    	  System.out.println("ByteArrayOutputStream done");
      }
      catch(Exception e) {
    	  System.out.println(e);
      }
	}
}
