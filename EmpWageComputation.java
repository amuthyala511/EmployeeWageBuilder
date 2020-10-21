public class EmpWageComputation
{
	static final int IS_PART_TIME=1;
	static final int IS_FULL_TIME=2;
	static final int EMP_WAGE_PER_HR=20;
	static final int NUM_OF_WORKING_DAYS=20;
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION ON MASTER BRANCH");
		int empHrs=0, empWage=0, totalEmpWage=0;
		for(int day=1;day<=NUM_OF_WORKING_DAYS;day++)
		{
			double empCheck=Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
			{
				case IS_PART_TIME:
					empHrs=4;
					System.out.println("Employee worked part time on day "+day);
					break;
				case IS_FULL_TIME:
               empHrs=8;
               System.out.println("Employee worked full time on day "+day);
               break;
				default:
					empHrs=0;
					System.out.println("Employee is Absent on day "+day);
					break;
			}
			empWage=empHrs*EMP_WAGE_PER_HR;
			System.out.println("Employee Wage on day "+day+" is: "+empWage);
			totalEmpWage+=empWage;
		}
		System.out.println("Employee wage for a month is: "+totalEmpWage);
	}
}
