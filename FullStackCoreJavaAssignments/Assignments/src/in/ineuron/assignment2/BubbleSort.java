package in.ineuron.assignment2;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {20,15,11,16,17,18,5,4,12,19,2,9,8,3,14,13,6,7,1,10};
		
		System.out.print("Taken Array to sort :: ");
		for(int i:arr)
			System.out.print(i + " ");
		
		for(int j=0;j<arr.length-1;j++)
		{
		for(int i=0;i<arr.length-1;i++)
		{
			int a=arr[i];
			int b=arr[i+1];
			if(b<a)
			{
				arr[i]=b;
				arr[i+1]=a;
			}
		}
		}
	
		System.out.print("\n Result ::");
		for(int j:arr)
			System.out.print(" "+j);

	}

}
