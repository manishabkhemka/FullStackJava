package in.ineuron.assignment2;

public class InsertionSort {

	public static void main(String[] args) {
	
		int[] arr= {29,43,68,44,51,51,16,1,80};
		
		System.out.print("Taken Array to sort :: ");
		for(int i:arr)
			System.out.print(i + " ");
		
		for(int i=1;i<arr.length-1;i++)
		{
				for(int j=i;j>0;j--)
				{
					if(arr[j]<arr[j-1])
					{
						int x=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=x;
						
						
					}
					
				}
				
			}
			
		System.out.print("\n Result ::");
		for(int z:arr)
			System.out.print(" "+z);

	}

}
