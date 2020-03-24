class shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}

	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}

class circle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}

	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}


class triangle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}

	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class square extends shape
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}

	public void erase()
	{
		System.out.println("Erasing Square");
	}
}



class HoA2
{
	public static void main(String[] args)
	{
		shape c = new circle();
		shape t = new triangle();
		shape s = new square();

		c.draw();
		c.erase();

		t.draw();
		t.erase();

		s.draw();
		s.erase();
	}
}