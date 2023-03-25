package in.ineuron.assignment4;

public class Assignment8 {

	private int[] getArray(String str)
	{
		int[] arr=new int[26];
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
		
		return arr;
	}
	boolean chkAnagram(String str1,String str2)
	{
		boolean result=false;
		
		if(str1.length()==str2.length())
		{
			int[] arr1=getArray(str1);
			int[] arr2=getArray(str2);
			
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
					result=true;
				else
				{
					result=false;
					break;
				}
				
			}
						
		}
		return result;
	}
	public static void main(String[] args) {
		
		Assignment8 obj=new Assignment8();
		
		String str1="aapple";
		String str2="elpape";
		
		System.out.println("Taken First string is :: "+str1 + " and second string is:: "+str2);
		System.out.print("Result is :: ");
		boolean b=obj.chkAnagram(str1, str2);
		
		if(b==true)
			System.out.println("Both Strings are anagram");
		else
			System.out.println("Both Strings are not anagram");

	}

}
