import java.util.*;
public class palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev_n=0;
        while(n>0)
        {
            rev_n=rev_n*10+n%10;
            n=n/10;
        }
            System.out.println(rev_n);
    if(rev_n == n){
      System.out.println("It is Palndrom no.");
	}
 else
      System.out.println("It is Not Palndrom no.");
}
	
