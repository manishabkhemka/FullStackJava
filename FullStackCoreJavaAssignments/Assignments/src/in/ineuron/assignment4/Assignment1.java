package in.ineuron.assignment4;

public class Assignment1 {

	
	//1. WAP to remove Duplicates from a String.(Take any String ex with duplicate character)
	private String removeDuplicate(String str)
	{
		String result="";
		
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
			
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		
		Assignment1 obj=new Assignment1();
		String str="ineuineuron";
		System.out.println("Taken string is :: "+str);
		System.out.println("After removing duplicate characters, String is:: "+obj.removeDuplicate(str));

	}

}

