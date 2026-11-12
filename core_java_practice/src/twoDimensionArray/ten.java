package twoDimensionArray;

public class ten {

	public static void main(String[] args) {
		int [][]a= {{10,20,30},{40,50,60},{70,80,90}};
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i][i];
		System.out.println("Diagonal Sum="+sum);

	}

}
