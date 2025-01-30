package javadsa;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,4,1,6,8,3};
		int length= arr.length;
		System.out.println("Unsorted");
		for(int i=0;i<length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i = 0; i<length;i++)
		{
			for(int j=1;j<length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		for (int i =0; i<length; i++)
		{
			System.out.println("Sorted array:" +arr [i]+" ");
		}

	}

}
