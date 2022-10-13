package dataStructuresExercise3Package;

public class Task5Class {
	public static int nrToPowerOfn(int nr, int n) {
		if(n == 0)
		{
			return 1;
		}
		for(int i=0; i<n-1; i++) {
			nr = nr * nr;
		}
		return nr;
	}
	//works for k = 2
	public static int JosephusProblem2(int n) {
		int i = 0;
		int m = n;
		while(m > 0) {
			m = m/2;
			i++;
		}
		int result = n - nrToPowerOfn(2, i-1);
		return (result*2) + 1;
	}
	public static int JosephusProblem(int n, int k) {
	if(n == 1) 
	{
		return 0;
	}
	else 
	{
		return (JosephusProblem(n-1, k) + k) % n;
	}
}
	public static void main(String[] args) {
		System.out.println(JosephusProblem(6, 2)+1);
	}
}
