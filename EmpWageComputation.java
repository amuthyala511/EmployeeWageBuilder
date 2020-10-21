public class EmpWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION ON MASTER BRANCH");
		final int IS_PART_TIME=1;
		final int IS_FULL_TIME=2;
		final int EMP_WAGE_PER_HR=20;
		int empHrs=0, empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck == IS_PART_TIME)
		{
			System.out.println("Employee worked part time");
			empHrs=4;
		}
		else if(empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee worked full time");
			empHrs=8;
		}
		else
		{
			System.out.println("Employee is Absent");
			empHrs=0;
		}
		empWage=empHrs*EMP_WAGE_PER_HR;
		System.out.println("Employee Daily Wage is: "+empWage);
	}
}
