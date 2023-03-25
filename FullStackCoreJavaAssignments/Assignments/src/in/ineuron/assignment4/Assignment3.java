
package in.ineuron.assignment4;

public class Assignment3 {

	//3. WAP to check if “2552” is palindrome or not.

		private String chkPalindrome(String str)
		{
			String result="";
				
			boolean flag=false;
			for(int i=0,j=str.length()-1;i<str.length()&& j>=0;i++,j--)
			{
				char ch=str.charAt(i);
				char ch2=str.charAt(j);
					if(ch!=ch2)
					{
						flag=true;
						break;
						
					}
			}
			if(flag==false)
				result="This is a Palindrome";
			else
				result="This is not a Palindrome";
			
			return result;
		}
		public static void main(String[] args) {
			Assignment3 obj=new Assignment3();
			
			String str="25752";
			System.out.println("Taken string is :: "+str);
			System.out.println("Result is :: "+obj.chkPalindrome(str));
			
		}

	}

