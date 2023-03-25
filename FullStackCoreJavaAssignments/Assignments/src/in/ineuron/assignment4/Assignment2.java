package in.ineuron.assignment4;

public class Assignment2 {

	//2. WAP to print Duplicates characters from the String.
	private String printDuplicate(String str)
	{
		String result="";
		String duplicate="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			boolean flag=false;
			
			for(int j=0;j<result.length();j++)
			{
			
				char ch2=result.charAt(j);
				
				if(ch==ch2)
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
				result=result+ch;
			else
				duplicate=duplicate+ch;
			
		}
		
		
		return duplicate;
	}
	public static void main(String[] args) {
		Assignment2 obj=new Assignment2();
		String str="ineuineuron";
		System.out.println("Taken string is :: "+str);
		System.out.println("Duplicates characters from the String are :: "+obj.printDuplicate(str));

	}

}
