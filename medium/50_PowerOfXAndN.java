class Solution {
	public double myPow(double x, int m) {
		double temp = x;
		if(m==0)
			return 1;
		temp=myPow(x,m/2);
		if(m%2==0)
			return temp*temp;
		else 
		{
			if(m > 0)
				return x*temp*temp;
			else
				return (temp*temp)/x;
		}
	}
}

/*

Instead of calculating 2^6 you can do 2^3 * 2^3



*/
