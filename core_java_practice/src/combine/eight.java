package combine;

public class eight {

	public static void main(String[] args) {
		int table=1;
		do
		{
			int i=1;
			do
			{
				System.out.print(table + "X" + i + "=" + (table*i));
				i++;
			}while(i<=10);
			System.out.println();
			table++;
		}while(table<=5);

	}

}
