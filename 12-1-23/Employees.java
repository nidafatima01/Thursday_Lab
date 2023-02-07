package OOPs;

public class Employees {

	long empId;
	String empName;
	String empAddress;
	long empPh;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;

	public Employees(long Id,String Name,String address,long phone) {
		empId=Id;
		empName=Name;
		empAddress=address;
		empPh=phone;
	}
	void calculateSalary() {
		double salary=0.0;
		salary=basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
		System.out.println("The Salary is: " +salary);
	}
	void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 10/100*basicSalary;
		double salary=basicSalary-transportAllowance;
		System.out.println("The Salary after Transport Allowance is: " +salary);
	}
}
class Manager extends Employees{
	double salary=0.0;
	public Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		basicSalary=salary;
	}
	@Override
	void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 15*basicSalary /100;
		double salary=basicSalary-transportAllowance;
		System.out.println("The Salary of  Manager after Transport Allowance is: " +salary);}
}
class Trainee extends Employees{
	double salary;
	public Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		basicSalary=salary;
	}
	@Override
	void calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = 10*basicSalary /100;
		double salary=basicSalary-transportAllowance;
		System.out.println("The Salary of Trainee after Transport Allowance is: " +salary);
	}
}