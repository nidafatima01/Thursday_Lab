package OOPs;

public class Accountant {
	
	int AccNo;
	String holderName;
	float AccBalance;
	static String ifscCode="ICICI348";
	static String branchName="ICICI Bank";
	
 public Accountant(int AccNo,String holderName,float AccBalance) {
	this.AccNo=AccNo;
	this.holderName=holderName;
	this.AccBalance=AccBalance;
    }

public int getAccNo() {
	return AccNo;
}

public String getHolderName() {
	return holderName;
}

public float getAccBalance() {
	return AccBalance;
}

public static String getIfscCode() {
	return ifscCode;
}

public static String getBranchName() {
	return branchName;
}
  
void Display() {
	System.out.println(+AccNo +" "+holderName+" "+AccBalance+" "+ifscCode+" "+branchName);
}
}