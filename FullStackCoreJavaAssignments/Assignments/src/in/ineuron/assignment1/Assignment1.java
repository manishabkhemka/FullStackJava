package in.ineuron.assignment1;

public class Assignment1 {

	public void printI()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if(i==1 || i==5 )
					System.out.print("*");
				else if(j==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
	public void printN()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if( j==1 || j==5)
					System.out.print("*");
				else if( (i==2 && j==2) || ( i==3 && j==3)|| ( i==4 && j==4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}
	
	public void printE()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if( i==1 || i==3|| i==5)
					System.out.print("*");
				else if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public void printU()
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if( j==1 || j==5)
					System.out.print("*");
				else if(i==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	
	}
	public void printR()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if( i==1 || i==3 || j==1)
					System.out.print("*");
				else if((i==2 && j==5)|| (i==4 && j==3) || (i==5 && j==4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public void printO()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if( i==1 || i==5)
					System.out.print("*");
				else if(j==1 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}
	public static void main(String[] args) 
	{
	
	
		Assignment1 Obja= new Assignment1();
		Obja.printI();
		System.out.println();
		Obja.printN();
		System.out.println();
		Obja.printE();
		System.out.println();
		Obja.printU();
		System.out.println();
		Obja.printR();
		System.out.println();
		Obja.printO();
		System.out.println();
		Obja.printN();
	
	}

}
