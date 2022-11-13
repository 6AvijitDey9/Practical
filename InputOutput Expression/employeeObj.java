package IO;
import java.io.Serializable;

public class employeeObj implements Serializable {
int id;
String ename;
transient int salary;
public employeeObj(int id, String ename, int salary) {
	this.id = id;
	this.ename = ename;
	this.salary = salary;
}}


