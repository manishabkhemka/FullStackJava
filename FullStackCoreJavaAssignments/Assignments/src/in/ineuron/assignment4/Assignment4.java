package in.ineuron.assignment4;

public class Assignment4 {

	private int[] getArray(String str)
	{
		
		int[] arr=new int[68];
		
		
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
				arr[no-32]=max;
			}
		
		return arr;
	}
	void chkString(String str)
	{
	
		int[] arr=getArray(str);
	
			int noCons=0;
			int noVowels=0;
			int noSpecial=0;
			
			for(int j=32;j<=60;j++)
			{
				if(j==33 || j==37 ||j==41||j==47||j==85)
					noVowels=noVowels+arr[j];
				else
					noCons=noCons+arr[j];
					
				arr[j]=0;
			}
			
			for(int i=0;i<arr.length;i++)
			{
				
				noSpecial=noSpecial+arr[i];
				
			}
			
			System.out.println("Number of Vowels in String are: "+noVowels);
			System.out.println("Number Of Consonents in String are : "+noCons);
			System.out.println("Number of Special chars is: "+noSpecial);
						
		
	}
	public static void main(String[] args) {
		
		Assignment4 obj=new Assignment4();
		
		String str="my () $@g;,irl wove six dozen plaid jackets before she quit";
		System.out.println("Taken string is :: "+str);
		System.out.print("Result is :: ");
		obj.chkString(str);
	}
}



