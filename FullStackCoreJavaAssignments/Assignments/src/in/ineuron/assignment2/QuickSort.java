package in.ineuron.assignment2;

public class QuickSort {
	
	int partition(int arr[], int startIndex, int endIndex)
    {
        int pivot = arr[endIndex];
        int i = (startIndex-1);
        for (int j=startIndex; j<endIndex; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
     
        int temp = arr[i+1];
        arr[i+1] = arr[endIndex];
        arr[endIndex] = temp;
 
        return i+1;
    }
 
 
    void sort(int arr[], int startIndex, int endIndex)
    {
            if(startIndex<endIndex)
            {
        	int pi = partition(arr, startIndex, endIndex);
        	 
        	sort(arr, startIndex, pi-1);
            sort(arr, pi+1, endIndex);
            }
    }
 
     static void printArray(int arr[])
    {
        for(int i:arr)
        	System.out.print(i+" ");
    }
 
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        
        System.out.print("Taken Array to sort :: ");
        printArray(arr);
        
        int n = arr.length;
       
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        
        System.out.println("\nsorted array :: ");
        printArray(arr);
    }
}

