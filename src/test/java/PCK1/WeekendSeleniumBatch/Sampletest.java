package PCK1.WeekendSeleniumBatch;

public class Sampletest {
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}


public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}


public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	public void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}

	public void voterid()
	{
		System.out.println("voterid");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampletest s = new Sampletest();
		s.add();
		s.mul();
		s.div();
	}

}
