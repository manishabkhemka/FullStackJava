package in.ineuron.assignment1;

public class Assignment5 {

	private void printPattern()
	{
		int k=14;
		for(int i=1;i<=14;i++)
		{
			
			for(int j=k;j>=1;j--)
			{
				
				System.out.print("*"); 
				
			}
			if(i==1)
			{
				k=k/2-1;
			}
			else if(i==13)
			{
				k=k*2;
			}
			else if(i<7)
			{
				k--;
			}
			else if(i>=7)
			{
				k++;
			}
						
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
				
		Assignment5 Obja=new Assignment5();
		Obja.printPattern();
		
	}

}
