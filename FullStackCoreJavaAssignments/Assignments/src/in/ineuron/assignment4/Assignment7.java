package in.ineuron.assignment4;

public class Assignment7 {

	private String chkUnique(String str)
	{
		String uniResult="";
		String result="";
		String duplicate="";
		boolean flag=false;
		
		for(int i=0;i<str.length()&& flag == false;i++)
		{
			char ch=str.charAt(i);
		
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
			{
				result=result+ch;
				uniResult="This String contains Unique characters";
			}
			else
				uniResult="This String does not contain Unique characters";
			
		}
		
		
			return uniResult;
		
	}
	public static void main(String[] args) {
		Assignment7 obj=new Assignment7();
		
		String str="ineuron";
		System.out.println("Taken string is :: "+str);
		System.out.print("Result is :: "+obj.chkUnique(str));
		

	}

}
