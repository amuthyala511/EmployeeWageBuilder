public class EmpWageComputation
{
	public static void main(String[] args)
	{
		int empHrs=8,empWage=0;
		int empWageperHr=20;
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION ON MASTER BRANCH");
		int IS_PRESENT=1;
		double empAttendance=Math.floor(Math.random()*10)%2;
		if(empAttendance == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			empWage=empHrs*empWageperHr;
			System.out.println("Employee Daily Wage is: "+empWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
