package assignment3;

public class Employee {
	String Name;
	int Id;
	String Designation;
	int Salary;
	public Employee(String Name,String Designation,int Salary) {
		this.Name=Name;
		this.Designation=Designation;
		this.Salary=Salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

}
