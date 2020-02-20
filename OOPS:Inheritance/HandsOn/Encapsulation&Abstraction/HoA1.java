class Author
{
	public String name;
	public String email;
	public char gender;

	public Author(String name,String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender()
	{
		return gender;
	}
}

class Book
{
	public String name;
	public double price;
	public int qtyInStock;
	public String AuthorName;
	String email;
	char gender;
	Author a;
	public Book(String name,double price,int qtyInStock,String AuthorName,String email,char gender)
	{
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		a = new Author(AuthorName,email,gender);
	}
	public void getData()
	{
		AuthorName = a.getName();
		email = a.getEmail();
		gender = a.getGender();
	}
}


public class HoA1
{
	public static void main(String[] args)
	{
		Book b = new Book("ABC",450,15,"XYZ","XYZ@mail.com",'M');
		b.getData();
		System.out.println(b.name+"\t"+b.price+"\t"+b.qtyInStock+"\t"+b.AuthorName+"\t"+b.email+"\t"+b.gender);
	}
}