package arith;


public class sumoddprime {
	public static void main(String args[])
	{
		
	 int even = 0;
     int odd = 0;
     boolean flag=false;
     
     
     for (int i = 1; i <=10; i++) {
         if (i % 2 == 0) {
             even =even+i; 
         } else {
             odd =odd+i;  
         }
     }
     
    
     System.out.println("Sum of Even numbers: " + even);
     System.out.println("Sum of Odd numbers: " + odd);
     for(int i=2;i<=10;i++ )
     {
     
     if(even%2==0)
     {
    	 flag=true;
    	 break;
     }
 
}
     if(flag)
     {
    	 System.out.println("non prime");
     }
     else
     {
    	 System.out.println("prime");
     }

     for(int i=1;i<=10;i++ )
     {
     
     if(odd%3==0)
     {
    	 flag=true;
    	 break;
     }
 
}
     if(flag)
     {
    	 System.out.println("non prime");
     }
     else
     {
    	 System.out.println("prime");
     }
     
}
}
