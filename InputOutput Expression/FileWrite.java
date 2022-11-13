package IO;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("E:\\Java IO\\fileWriter.txt");
	        file.write("Line created by FileWriter");
	        file.close();
	        System.out.println("FileWriter Done");
		}
			catch(Exception e) {
				System.out.println(e);
		}}}
