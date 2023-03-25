package in.ineuron.assignment4;

public class Assignment5 {

	private int[] getArray(String[] strarr)
	{
		
		int[] arr=new int[26];
		
		for(String str:strarr)
		{
			//str=str.toLowerCase();
			str=str.toUpperCase();
		
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
				int no=(int)ch;
				arr[no-65]=max;
			}
		}
		return arr;
	}
	boolean chkPanagram(String str)
	{
		boolean result=false;
		
		String strarr[]=str.split(" ");
	
		
		int[] arr1=getArray(strarr);
	
			
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=0)
					result=true;
				else
				{
					result=false;
					break;
				}
				
			}
						
		
		return result;
	}
	public static void main(String[] args)
	{
		Assignment5 obj=new Assignment5();
		String str="my girl wove six dozen plaid jackets before she quit";
		System.out.println("Taken string is :: "+str);
		System.out.print("Result is :: ");
		boolean b=obj.chkPanagram(str);
		if(b==true)
			System.out.println("This Strings is Panagram");
		else
			System.out.println("This Strings is not Panagram");

	}

}


