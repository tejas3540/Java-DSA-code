package javadsa;
import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int cnt = 0;
		while(temp>0)
		{
			cnt++;
			temp/=10;
		}
		temp=n;
		int sum=0;
		int d=0;
		while (temp>0)
		{
			d =temp%10;
			sum=sum+(int)Math.pow(d,cnt);
			temp=temp/10;
		}
		if(n==sum)System.out.println(true);
		else System.out.println(false);

	}

}
