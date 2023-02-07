package OOPs;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager mngr=new Manager(126534,"Peter","Chennai",237844, 65000); 
        mngr.calculateSalary();
        mngr.calculateTransportAllowance();
        Trainee trn=new Trainee(29846,"Jack","Mumbai",442085,45000);
        trn.calculateSalary();
        trn.calculateTransportAllowance();
	}

}
 