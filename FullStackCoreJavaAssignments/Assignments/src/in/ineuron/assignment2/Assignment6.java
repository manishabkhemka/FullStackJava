package in.ineuron.assignment2;

public class Assignment6 {
	
	static void printArray(int arr[])
	{
	        for(int i:arr)
	        	System.out.print(i+" ");
	        
	        System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,4,3,2,1};
		int subArr[]= {4,3,2,7};
		boolean status=false;
			
		System.out.println("Array A:: ");
		printArray(arr);
		
		System.out.println("Array B:: ");
		printArray(subArr);
		
		
		for(int j=0;j<subArr.length;j++)
		{
			
			
			boolean flag=false;
			int number=subArr[j];
			for(int i=0;i<arr.length;i++)
			{
				int k=arr[i];
				if(number==k)
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
				
			}
			if (flag==true)
			{
				status=true;
			}
			else
			{
				status=false;
				break;
			}
		}
		if(status==true)
			System.out.println("Result is:: Array B is subset of Array A");
		else
			System.out.println("Result is:: Array B is not subset of Array A");
	}}
