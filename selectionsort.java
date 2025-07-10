package basics;

import java.util.Arrays;

public class Selectionsort  {
 public static void main (String [] args)
 {
	 int [] a = {29,10,14,37,14};
	 selectionsortex(a);
 }
 public static void selectionsortex(int[] a) {
	 for(int i = 0; i < a.length; i++)
	 {
		 int minindex = i;
		 for(int k=i+1; k<a.length; k++)
		 {
			 if(a[k] < a[minindex])
			 {
				 minindex=k;
			 }
		 }
		 int temp =a[i];
		 a[i]=a[minindex];
		 a[minindex]=temp;
		 
		 System.out.println(Arrays.toString(a));
	 }
 }
 
}
