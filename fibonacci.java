
import java.util.Scanner;

public class fibonacci
{
	static int ctr=0;
	static long[] fSeries;
	
	public static void fiboSeries (int num)
	{
		fSeries = new long[num+1];
		fibo(num);
	}
	
	public static long fibo(int num)
	{
		long val;
		if (num<2)
			val = num;
		else if (fSeries[num]!=0)
			return fSeries[num];
		else
			val = fibo(num-1)+fibo(num-2);
		
		fSeries[num] = val;
		
		return val;
	}
	
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		int num;
		
		System.out.print("Please enter a array size: ");
		num = input.nextInt();
		
		fiboSeries(num);
		System.out.print("FIBONACCI:\t");
		for (int i = 0; i <= num; i++)
			System.out.print(fSeries[i] + "\t");
		System.out.print("\nArray Index:\t");
		for (int i = 0; i <= num; i++)
			System.out.print(i + "\t");
		
	}
}