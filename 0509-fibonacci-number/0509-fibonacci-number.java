class Solution {
    public int fib(int n) {
        int b =1;
int total=0;
int ans =0;
if(n==1){
    total=n;
}
	for (int i = 0; i <n-1; i++) {
		total =ans+b;
		ans=b;
		b=total;
		
	}
	return total;
    }
}