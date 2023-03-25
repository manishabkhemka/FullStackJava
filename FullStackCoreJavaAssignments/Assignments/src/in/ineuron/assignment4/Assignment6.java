package in.ineuron.assignment4;

public class Assignment6 {
	
	private void maxOccur(String str)
	{
		int maxOccur=0;
		char maxOccurchar=' ';
		
		for(int i=0;i<str.length();i++)
		{
			int max=0;
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
			
				char ch2=str.charAt(j);
				
				if(ch==ch2)
				{
					max++;
				}
				
			}
			if(maxOccur<max)
			{
				maxOccur=max;
				maxOccurchar=ch;
			}
		}
		
	System.out.println("The character "+maxOccurchar+ " occurred "+maxOccur+" times.");
		
	}
	public static void main(String[] args) {
		Assignment6 obj=new Assignment6();
		String str="ineuroniiiiin";
		System.out.println("Taken string is :: "+str);
		System.out.print("Result is :: ");
		obj.maxOccur(str);

	}

}
