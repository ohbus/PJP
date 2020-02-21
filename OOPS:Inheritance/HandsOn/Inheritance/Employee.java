public class Employee extends Person
{
	double AnnualSalary;
	int YearOfJoin;
	String NationalInsuranceNumber;

	Employee()
	{
		AnnualSalary = 00.00;
		YearOfJoin = 0;
		NationalInsuranceNumber = null;
	}

	/*Setter methods*/


	public void SetSalary(double Salary)
	{
		this.AnnualSalary = Salary;
	}

	public void SetYearOfJoin(int year)
	{
		this.YearOfJoin = year;
	}

	public void SetInsurance(String NaInsNumber)
	{
		this.NationalInsuranceNumber = NaInsNumber;
	}


	/* Getter methods*/

	public double GetSalary()
	{
		return AnnualSalary;
	}

	public int GetYearOfJoin()
	{
		return YearOfJoin;
	}

	public String GetInsurance()
	{
		return NationalInsuranceNumber;
	}
}