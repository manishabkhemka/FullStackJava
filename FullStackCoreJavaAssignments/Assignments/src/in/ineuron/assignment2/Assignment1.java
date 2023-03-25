package in.ineuron.assignment2;

public class Assignment1 {

	public static void main(String[] args) {
			
		int arr[]={1,2,3,4,5,4,3,2,1};
		
		int arr2[]=new int[arr.length]; 
		int arr3[]=new int[arr.length]; 
		
		System.out.print("Taken Array to to find the duplicates :: ");
		for(int i:arr)
			System.out.print(i + " ");
		
	
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			int k=arr[i];
						
			if(i==0)
				arr2[i]=k;
			else
			{
			for(int j=0;j<arr2.length-1;j++)
			{
				
				if(arr2[j]==k)
				{
					flag=true;
					break;
				}
				else
				{
					if(arr2[j]==0)
					{
						arr2[j]=k;
						break;
					}
				}
			
			}
			if (flag==true)
			{
				System.out.print("\nduplicate value detected : "+arr[i]);
			}
			
			}
			
		}
		//System.out.print("\nnew array with unique elem is: ");

		/*for(int a:arr2)
		{
			System.out.print(" "+a);
		
		}*/
	}

}
