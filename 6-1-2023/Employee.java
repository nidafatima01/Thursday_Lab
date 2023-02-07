/*wap to create one class name employee and add properties like id,name,salary,phno.
perform operations like set values and also getter method to display those values. 
and declare one more operation annualSalaryCalculation(),
based on salary calculate annual salary and print that.
*/

package OOPs;

class Employe{
	int id;
	String name;
	float salary;
	long phoneNo;
	float annualSalary;
	
	void setData(int id,String name,float salary,long phoneNo){
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  this.phoneNo=phoneNo;
	}
	void getData(){
		System.out.println("Id: "+id +", Name: "+name+ ", Salary: " +salary+ " Phone Number: " +phoneNo);
	}
	void annualSalaryCalculation(){
		annualSalary = this.salary*12;
		System.out.println("THe Annual Salary of an Employee is: " +annualSalary +" Lakh");
	}
}

public class Employee {

	public static void main(String[] args) {
		Employe obj = new Employe();
		obj.setData(1,"Nida Fatima", 100000, 767849061);
		obj.getData();
		obj.annualSalaryCalculation();
	   }
	}
