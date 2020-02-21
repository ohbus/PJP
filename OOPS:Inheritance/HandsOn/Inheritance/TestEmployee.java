public class TestEmployee
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();

		emp.SetName("ABC");
		emp.SetSalary(50000);
		emp.SetYearOfJoin(2020);
		emp.SetInsurance("50113");


		System.out.println(emp.GetName()+"\t"+emp.GetSalary()+"\t"+emp.GetYearOfJoin()+"\t"+emp.GetInsurance());
	}
}
