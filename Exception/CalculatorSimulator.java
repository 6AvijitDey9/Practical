package Exception;
import java.util.Scanner;
class CountryNotValidException extends Exception{
	public CountryNotValidException(String msg){
		super(msg);}}
class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String msg) {
		super(msg);}}
class TaxNotEligibleException extends Exception{
	TaxNotEligibleException(String msg){
		super(msg);}}

class TaxCalculator{
	String empName; boolean isIndian; double empSal, taxAmount;	
	public void calculateTax(double empSal, String empName, boolean isIndian) throws Exception {
		if(isIndian==false) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");}
		else if(empName==null) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");}
				else if(empSal>100000 && isIndian==true) {
			taxAmount = (empSal *8)/100;
			System.out.println("The tax is: " + taxAmount);}
		else if(empSal>50000 && empSal<100000 && isIndian==true) {
			taxAmount = (empSal *6)/100;
			System.out.println("The tax is: " + taxAmount);}
		else if(empSal>30000 && empSal<50000 && isIndian==true) {
			taxAmount =(empSal *5)/100;
			System.out.println("The tax is: " + taxAmount);}
		else if(empSal>10000 && empSal<30000 && isIndian==true) {
			taxAmount =(empSal *4)/100;
			System.out.println("The tax is: " + taxAmount);}
		else {
			try {	
				throw new TaxNotEligibleException("The employee does not need to pay tax");}
			catch(TaxNotEligibleException e) {
				System.out.println(e);}
			finally {
				System.out.println("The tax is: " + taxAmount);}}}}

public class CalculatorSimulator {
	public static void main(String[] args) throws Exception {
		TaxCalculator tc=new TaxCalculator();
		try {
			System.out.println("The first user details: "); tc.calculateTax(34000, "Ron", false);}		
		catch(CountryNotValidException e) {
			System.out.println(e);}
		try {
			System.out.println("The second user details: "); tc.calculateTax(1000, "Tim", true);}		
		catch(TaxNotEligibleException e) {
		System.out.println(e);}
		System.out.println("The third user details: "); tc.calculateTax(55000, "Jack", true);
		try {
			System.out.println("The last user details: "); tc.calculateTax(30000, null, true);}		  
		catch(EmployeeNameInvalidException e) {
			System.out.println(e);}}}
