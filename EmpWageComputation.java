public class EmpWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION ON MASTER BRANCH");
		int IS_PRESENT=1;
		double empAttendance=Math.floor(Math.random()*10)%2;
		if(empAttendance == IS_PRESENT)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
