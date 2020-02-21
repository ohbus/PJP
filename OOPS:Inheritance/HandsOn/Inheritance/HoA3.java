class person
{
	String name;
	String dob;

	person(String name,String dob)
	{
		this.name= name;
		this.dob = dob;
	}

	public String getName()
	{
		return name;
	}

	public String getDob()
	{
		return dob;
	}
}

class teacher extends person
{
	double salary;
	String subject;

	teacher(String name,String dob,double salary,String subject)
	{
		super(name,dob);
		this.salary = salary;
		this.subject = subject;
	}

	public double getSalary()
	{
		return salary;
	}

	public String getSubject()
	{
		return subject;
	}
}

class student extends person
{
	int studentId;

	student(String name,String dob,int studentId)
	{
		super(name,dob);
		this.studentId = studentId;
	}

	public int getStudentId()
	{
		return studentId;
	}
}

class collegeStudent extends student
{
	String collegeName;
	String year;

	collegeStudent(String name,String dob,int studentId,String collegeName,String year)
	{
		super(name,dob,studentId);
		this.collegeName = collegeName;
		this.year = year;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

	public String getYear()
	{
		return year;
	}
}

public class HoA3
{
	public static void main(String[] args)
	{
		collegeStudent cs = new collegeStudent("Abc","11/01/1998",50,"xyz institute","Fourth");
		teacher th = new teacher("teacher1","15/01/1987",50000,"Math");


		System.out.println("Student details...");
		System.out.println(
							cs.getName()+"\t"+
							cs.getDob()+"\t"+
							cs.getStudentId()+"\t"+
							cs.getCollegeName()+"\t"+
							cs.getYear()
						  );

		System.out.println();
		System.out.println("Teacher details...");
		System.out.println(
							th.getName()+"\t"+
							th.getDob()+"\t"+
							th.getSalary()+"\t"+
							th.getSubject()
						  );
	}
}