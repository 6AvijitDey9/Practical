#include<iostream> //Import 
#include<cctype>
#include<iomanip>
#include<fstream>
using namespace std; //To avoid calling std everytime whenever we print anything

class account //Creating class
{
	int acno; //Initialing variables
	char name[50]; 
	int amount;
	char type;
public: //Public Modifier
	void create_account();
	void show_account() const; //const keyword defines that all the values are constant and prevent programmers to modify it
	void modify();
	void deposit(int);
	void withdraw(int);
	void details() const;
	void check_deposit() const;
}; //Need to use semicolon whenever after class declaration

void account::create_account() //Method body
{
	system("CLS"); //Clear screen statement
	cout<<"\n\t\t\tEnter the Account No. : "; //Taking user inputs and store it in variables
	cin>>acno;
	cout<<"\n\n\t\t\tEnter the Name of the Account holder : ";
	cin.ignore(); //Helps to clear input buffer
	cin.getline(name,50); //taking user input 
	cout<<"\n\t\t\tEnter Type of the Account (C/S) : ";
	cin>>type;
	type=toupper(type); //If user gives input in small case it will be converted to upper case
	cout<<"\n\t\t\tEnter The Initial amount : ";
	cin>>amount;
	cout<<"\n\n\t\t\tAccount Created..";
}

void account::show_account() const //const keyword defines that all the values are constant
{
	cout<<"\n\t\t\tAccount No. : "<<acno;
	cout<<"\n\t\t\tAccount Holder Name : ";
	cout<<name;
	cout<<"\n\t\t\tType of Account : "<<type;
	cout<<"\n\t\t\tBalance amount : "<<amount;
}

void account::modify()
{
	cout<<"\n\t\t\tAccount No. : "<<acno; //It will show user's account number to modify details
	cout<<"\n\t\t\tModify Account Holder Name : ";
	cin.getline(name,50); 
	cout<<"\n\t\t\tModify Type of Account : ";
	cin>>type;
	type=toupper(type);
	cout<<"\n\t\t\tModify Balance amount : ";
	cin>>amount;
}

void account::deposit(int x)
{
	amount+=x; //The value of x will be added to the current amount
	cout<<"\n\n\t\t\tThe balance is sucessfully deposited";
}
void account::withdraw(int x)
{
	amount-=x; //The value of x will be deducted from the current amount
	cout<<"\n\n\t\t\tThe balance is sucessfully withdrawned";
}

void account::details() const
{
	cout<<acno<<setw(10)<<" "<<name<<setw(10)<<" "<<type<<setw(6)<<amount<<endl; //Will show user the full details
}
void account::check_deposit() const
{
	cout<<amount; //Will return user's current amount on account
}

int main()
{
    account ac;
	char ch;
	int num;
	do
	{
	system("CLS");
	cout<<"\n\n\t\t\t\t........................\n";
	cout<<"\t\t\t\tBANK MANAGEMENT SYSTEM";
	cout<<"\n\t\t\t\t........................\n";

		cout<<"\t\t\t\t    ::MAIN MENU::\n";
		cout<<"\n\t\t\t\t1. CREATE ACCOUNT";
		cout<<"\n\t\t\t\t2. DEPOSIT AMOUNT";
		cout<<"\n\t\t\t\t3. WITHDRAW AMOUNT";
		cout<<"\n\t\t\t\t4. BALANCE ENQUIRY";
		cout<<"\n\t\t\t\t5. ACCOUNT HOLDER DETAILS";
		cout<<"\n\t\t\t\t6. MODIFY AN ACCOUNT";
		cout<<"\n\t\t\t\t7. EXIT";
		cout<<"\n\n\t\t\t\tSelect Your Option (1-7): ";
		cin>>ch;

		switch(ch)
		{
		case '1':
			ac.create_account();
			break;
		case '2':
			system("CLS");
			cout<<"\n\n\t\t\tEnter The amount : "; cin>>num;
			ac.deposit(num);
			break;
		case '3':
			system("CLS");
			cout<<"\n\n\t\t\tEnter The amount : "; cin>>num;
			ac.withdraw(num);
			break;
		case '4':
			system("CLS");
			cout<<"\n\n\t\t\tYour current balance is : ";
			ac.check_deposit();
			break;
		case '5':
			ac.details();
			break;
		case '6':
			system("CLS");
			ac.modify();
			break;
		 case '7':
		 	system("CLS");
			cout<<"\n\n\t\tThank you for visiting us.....";
			break;
		 default :cout<<"\a";
		}
		cin.ignore();
		cin.get();
    }while(ch!='7');
	return 0;
}
