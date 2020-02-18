class Patient
{
	String patientName;
	double height;
	double weight;

	public Patient(String patientName, double height, double weight)
	{
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	public double computeBMI()
	{
		return weight / (height * height);
	} 
}


public class HoA3
{
	public static void main(String[] args)
	{
		Patient p = new Patient("John",2.5,65);
		System.out.println("The BMI is : "+p.computeBMI());
	}
}