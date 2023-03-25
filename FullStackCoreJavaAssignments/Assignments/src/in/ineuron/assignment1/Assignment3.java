package in.ineuron.assignment1;

public class Assignment3 {

	private void printPattern()
	{
		
	   int k=7;
	   int x=7;
		for(int i=1;i<=14;i++)
		{
			int y=0;
			for(int j=1;j<=14;j++)
			{
					if( i==14 || i==1 || j<=k || j==x || j==1|| j==14)
						System.out.print("*");
					else if( j>=x+y )
					{
						System.out.print("*");
						y++;
					}
					else
						System.out.print(" ");
					
			}
			k--;
			x++;
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
	
		
		Assignment3 obja=new Assignment3();
		obja.printPattern();
			}
			
		
	

}
