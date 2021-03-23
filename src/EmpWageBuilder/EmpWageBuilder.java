package EmpWageBuilder;

public class EmpWageBuilder {
public static void main(String[] args){
		//calculate daily wages 
	//constants
	int IsEmpPresent=1;
	int EMP_RATE_PER_HOUR =20;
	//Variable
	int empHrs =0;
	int empWage =0;
	//computation
	double empCheck = Math.floor(Math.random() * 10 ) % 2 ;
	if(empCheck == IsEmpPresent)
		empHrs =8;
	else
		empHrs =0;
	empWage = empHrs *  EMP_RATE_PER_HOUR;
	System.out.println("Emp WAGE " +empWage );

	}
}
