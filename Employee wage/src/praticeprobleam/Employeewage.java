package praticeprobleam;

public class Employeewage {
	public static void main(String[] args) {
		System.out.println  (" welcome to employee wage computation program" );
		int IS_PART_TIME =1;
		int IS_FULL_TIME =2;
		int EMP_RATE_PER_HOUR= 20;
		 
		int empHRs =0;
		int empwage=0;
	    double empcheck = Math.floor(Math.random() *10 % 3 );
		if ( empcheck == IS_PART_TIME) {
		    empHRs = 4 ;
		}
		else if (empcheck == IS_FULL_TIME)
		empHRs=8;
		else 
		empHRs=0;
		empwage = empHRs * EMP_RATE_PER_HOUR;
	    System.out.println("Emy wage : " + empwage );
	
}
	}



