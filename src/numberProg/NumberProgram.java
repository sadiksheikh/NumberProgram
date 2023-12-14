package numberProg;

public class NumberProgram {
	
		public static void main(String[] args) {
	

//		//Prime Number 1 to 100;
//			
//		for(int a=1; a<=100; a++)
//		{
//			int b=0;
//			for(int c=2; c<a; c++)
//			{
//				if (a%c==0)
//				{
//					b++;
//				}
//			}
//			if(b==0)
//			{
//				System.out.println(a);
//			}
//		}
		
//------------------------------------------------------------------		
		
		
//		// Prime Number
	
		
//		int a=6;
//		int b=0;
//		for(int c=2; c<a; c++)
//		{
//			if(a%c==0)
//			{
//				b++;
//			}
//		}
//			if(b==0)
//			{
//				System.out.println(a+" is Prime Number");
//			}
//			else
//			{
//				System.out.println(a+" is Not Prime Number");
//			}
		
		
		
		
//----------------------------------------------------------------
		
//			//  swaping of two numbers with the help of third variable
	      
//      int a = 20;
//      int b = 55;
//      int c;
//      c=a;
//      a=b;
//      {
//      System.out.println("a after swapping - "+a);
//      }
//      b=c;
//      {		 
//     System.out.println("b after swapping - "+b);
//      }
      
 //-------------------------------------------------------------  
     	
//     	// swapping of two numbers without using third variable
		
//		int a = 15;
//		int b = 55;
//		
//		a=a+b;	//15+55=70-->a
//		
//		
//		b=a-b;	//70-55=15-->b
//		
//		{
//			System.out.println("b after swapping - "+b);
//		}
//		
//		a=a-b;	//70-15=55-->a
//		{
//			System.out.println("a after swapping -"+a);
//		}
		
//--------------------------------------------------------------------
		
//			// For loop
			
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		
//		for(int i=1; i<=a.length; i++)
//		{
//			System.out.println(i);
//		}
//		
			
//		//Each For Loop
			
//		for (int i : a)
//		{
//			System.out.println(i);
//		}
		
//----------------------------------------------------------
		
//			//Largest of Three Number
			
//		int A=2000;
//		int b=2000;
//		int c=300;
//		
//		if(A>=b && A>=c)
//		{
//			System.out.println(A+" is greater");
//		}
//		else if(b>=A && b>=c)
//		{
//			System.out.println(b+" is greater");
//		}
//		else
//		{
//			System.out.println(c+" is greater");
//		}
			
//----------------------------------------------------------------		
//			// Largest of Four Number
			
//			int a=100;
//			int b=20;
//			int c=25;
//			int d=65;
//			
//			if(a>=b && a>=c && a>=d)
//			{
//				System.out.println(a + " is Greater Number ");
//			}
//			else if(b>=a && b>=c && b>=d)
//			{
//				System.out.println(b +" is Greater Number ");
//			}
//			else if(c>=a && c>=b && c>=d)
//			{
//				System.out.println(c +" is Greater Number ");
//			}
//			else
//				System.out.println(d+" is Greater Number ");
			
					
			
//	-----------------------------------------------------------
		
//		// Prime Number 
			
//		int a =29;
//		int b=0;
//		
//		for(int c=2; c<a; c++)
//		{
//			if(a%c==0)
//			{
//				b++;
//			}
//		}	
//			if(b==0)
//			{
//				System.out.println(a+" is Prime Number");
//			}
//			else
//			{
//				System.out.println(a+" is not Prime Number");
//			}
		
		
//		--------------------------------------------------------
		
//			// Prime Number 1 to 100
			
//		for(int a=1; a<=100; a++)
//			
//		{
//			int c= 0;
//			for(int b=2; b<a; b++)
//			{
//				if(a%b==0)
//				{
//					c++;
//				}
//			}
//		
//		if(c==0)
//		{
//			System.out.println(a+" is Prime Number");
//		}
//		else
//		{
//			System.out.println(a+" is not Prime Number");
//		}
//		
//		}
		
		
//		-----------------------------------------------------
		
////			 // Odd Even Number
//			
//		for(int a=1; a<=10; a++) // a+=2  if want to increase by 2
//		{
//			if(a%2==0)
//			{
//				System.out.println(a+ " is even number");
//			}
//		
//			else
//			{
//				System.out.println(a+ " is odd number");
//			}
//		  }
		
//		--------------------------------------------------------
		

// 			// Reversr Number
		
//		int number = 123;
//		int rem;
//		int rev=0;
//		
//		while(number != 0)
//		{
//			rem =number%10;
//			rev= rev*10+rem;
//			
//			number = number/10;
//		}
//		System.out.println(rev);
		
			
//-------------------------------------------------------------------
			
//			// Fibonacci series
//			
//			int a =0;
//			int b =1;
//			int c;
//			
//			for (int i=1; i<=10; i++)
//			{
//				 c = a+b;
//				System.out.println(c);
//				a=b;
//				b=c;
//			}
			
//--------------------------------------------------------------------
			
//			// Palindrome Number
			
//			int n = 12121;
//			int number = n;
//			
//			int rem;
//			int rev=0;
//			
//			while(number!=0)
//			{
//				rem=number%10;
//				rev=rev*10+rem;
//				
//				number=number/10;	
//			}
//			if(n==rev)
//			{
//				System.out.println(n+" is Palindrome Number");
//			}
//			else
//			{
//				System.out.println(n+" is not Palindrom Number");
//			}
			
//----------------------------------------------------------------------
			
////			// Armstrong Number
//			
//			int n =153;
//			int n1=n;
//			int length =0;
//			
//			while(n1!=0)
//			{
//				length = length+1;
//				n1=n1/10;
//			}
//			
//			int n2 = n;
//			int arm =0;
//			int rem;
//			while(n2!=0)
//			{
//				int mul =1;
//				rem= n2%10;
//				for(int i=1; i<=length; i++)
//				{
//					mul = mul*rem;
//				}
//				arm = arm+mul;
//				n2=n2/10;
//			}
//			
//			if(n==arm)
//			{
//				System.out.println(n+" is Armstrong Number");
//			}
//			else
//			{
//				System.out.println(n+" is not Armstrong Number");
//			}
			
			
//-------------------------------------------------------------------------			
			
//			// Sum of 10 Natural Number
			
//			int sum=0;
//			
//			for(int i=1; i<=10; i++)
//			{
//				sum=sum+i;
//			}
//			System.out.println(sum);
			
//---------------------------------------------------------------------------
			
//			//Multipication of 10 Natural Number
			
//			int mul =1;
//			
//			for(int i=1; i<=10; i++)
//			{
//				mul=mul*i;
//			}
//			System.out.println(mul);
			
//-----------------------------------------------------------------------
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			}	
		}
			
			
			
		
		
		
		
		
		
	



