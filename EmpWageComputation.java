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
		switch((int)empCheck)
		{
			case IS_PART_TIME:
									empHrs=4;
									System.out.println("Employee worked part time");
									break;
			case IS_FULL_TIME:
                           empHrs=8;
                           System.out.println("Employee worked full time");
                           break;
			default:
						empHrs=0;
						System.out.println("Employee is Absent");
						break;
		}
		empWage=empHrs*EMP_WAGE_PER_HR;
		System.out.println("Employee Daily Wage is: "+empWage);
	}
}
