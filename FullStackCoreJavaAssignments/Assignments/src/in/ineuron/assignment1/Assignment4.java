package in.ineuron.assignment1;

public class Assignment4 {

	private void printPattern()
	{
		
	   int k=1;
	   int x=14;
		for(int i=1;i<=8;i++)
		{
			int y=0;
			for(int j=1;j<=14;j++)
			{
								
					if(j<=k || i==8) 
					{
						System.out.print("*");
					}
					else if( j==x )
					{
						System.out.print("*");
						y=1;
					}
					else if( j==x+y )
					{
						System.out.print("*");
						y++;
					}
					else
						System.out.print(" ");
					
			}
			k++;
			x--;
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		
		Assignment4 obja=new Assignment4();
		obja.printPattern();
	}

}
