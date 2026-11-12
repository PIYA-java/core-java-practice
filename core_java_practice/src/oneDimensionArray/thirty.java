package oneDimensionArray;

import java.util.Scanner;

public class thirty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter arrays size :");
int n=sc.nextInt();
int []a=new int[n];
System.out.println("Enter"+n+"Elements:");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<a.length;i++)
{
	sum=sum+a[i];
}
System.out.println("Sum="+sum);
	}

}
