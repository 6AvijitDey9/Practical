package IO;
import java.io.*;
public class ObjecOutput {

	public static void main(String[] args) throws Exception {
		employeeObj emp = new employeeObj(100, "RituMiya", 1000);
		FileOutputStream file = new FileOutputStream("E:\\Java IO\\ObjecOutput.txt");
        ObjectOutputStream obj = new ObjectOutputStream(file);
        FileInputStream objj = new FileInputStream("E:\\Java IO\\ObjecOutput.txt");
        obj.writeObject(emp);
        System.out.println("Object PutPutoutput Done ");
        int i = 0;
        while((i=objj.read())!=-1) {
        	System.out.print((char)i);
        }
	}
}
