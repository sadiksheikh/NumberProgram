package numberProg;

public class StarProgr {
	
	public static void main(String[] args) {
		
//		for (int a=1; a<=5; a++)	
//		{
//			for (int b=1; b<a; b++)  
//			{							
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		for (int c=1; c<=4; c++) 
//		{
//		for (int d=3; d>=c; d--) 
//		{
//			System.out.print(" ");
//	}
//		System.out.println("*");
//		}
		
//			----------------------
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//			System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		  ------------------------
		
		////Forword Arrow Shape
		
//		for (int i=1; i<=5; i++) 
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//		System.out.println("");
//		}
//		for (int i=4; i>=1; i--) 
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//		System.out.println("");
//		}
		
//			----------------------------
		
////		 Reversr Arrow
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>=1; i--)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		-------------------------------------
		
		
		//// Arrow Shape
		
//		for (int i=1; i<=10; i++)
//		{
//			for(int j=1; j<i; j++)
//			{
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		
//		for (int k=9; k>=1; k--)
//		{
//			for(int l=1; l<k; l++)
//			{
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
		
		//----------------------------
		
		//// V and X pattern
		
		for(int i=1; i<=5; i++)	
		{
			for(int j=1; j<=9; j++)
			{
				if((i-j==0)||(i+j==10))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
////		
////		
		for (int k=2; k<=5; k++)
		{
			for (int l=1; l<=9; l++)
			{
			if((l-k==4)||(k+l==6))
				{
				System.out.print("*");
				}
			else 
				{
			System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		//---------------------------

		
//		X-Pattern Short New Method 
		
//		for (int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				if(i==j || i+j==6)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		-----------------------------------
		
		////Diamond Shape(just give space before '*'
//		in Reverse shape Arrow Program)
		
//		for(int i=1; i<=5; i++)
//		{
//		for(int j=4; j>=i; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++)
//		{
//		System.out.print(" *");
//		}
//		System.out.println();
//	}
//	
//	for(int i=4; i>=1; i--)
//	{
//		for(int j=4; j>=i; j--)
//		{
//			System.out.print(" ");
//		}
//		for(int k=1; k<=i; k++)
//		{
//		System.out.print(" *");
//		}
//		System.out.println();
//	}
		
//		----------------------------------------
		
		//// 12345 Trangle Shape
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		------------------------------------
		
		//// Double Oposite Trangle
		
//		int n = 5;
//		
//		for(int i=1; i<=n; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			for(int k=i; k<n; k++)
//			{
//				System.out.print(" ");
//			}
//			for(int l=i; l<n; l++)
//			{
//				System.out.print(" ");
//			}
//			for(int m=1; m<=i; m++)
//			{
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		----------------------------------
		
		
//		int a=5;
//		
//		for(int i=a; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			for(int k=i; k<a; k++)
//			{
//				System.out.print(" ");
//			}
//			for (int l=i; l<a; l++)
//			{
//				System.out.print(" ");
//			}
//			for(int m=1; m<=i; m++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		---------------------------------------
		
//		Trangle of Stars (1,3,5,7,9)
		
		
//		int a=5;
//		
//		for(int i=1; i<=a; i++)
//		{
//			for(int j=i; j<a; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			for(int l=1; l<i; l++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		-------------------------------------
		

//		ABCD Trangle
		
//		int a=5;
//		
//		for(int i=1 ,p='A'; i<=a; i++ ,p++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print((char)p);
//			}
//			System.out.println();
//		}
		
//		---------------------------------	
		
//		ABCDE Trangle Add in Column Type
		
//		int a=5;
//		for(int i=1; i<=a; i++)
//			{int p='A';
//				for(int j=i; j<a; j++)
//				{
//					System.out.print(" ");
//				}
//				for(int k=1 ; k<=i; k++)
//				{
//					System.out.print((char)p++);
//				}
//				for(int l=1; l<i; l++ )
//				{
//					System.out.print((char)p++);
//				}
//				System.out.println();
//			}
		
//		-----------------------------------
		
//		ABCDE Trangle Add in Row Type
		
//		(p=p+2 and p+=2 both are use for *2 increment)
		
//		int b=5; int p='A';
//		for(int i=1; i<=b; i++ ,p+=2)
//			{
//				for(int j=i; j<b; j++)
//				{
//					System.out.print(" ");
//				}
//				for(int k=1; k<=i; k++ )
//				{
//					System.out.print((char)p);
//				}
//				for(int l=1; l<i; l++)
//				{
//					System.out.print((char)p);
//				}
//				System.out.println();
//			}
		
//		--------------------------------------
		
//		Trangle Name Print
		
//		String a="S@D!K";
//		int n= a.length();
//		
//		for(int i=1 ,p=0; i<=n; i++ ,p++)
//		{
//			for(int j=i; j<n; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print(a.charAt(p));
//			}
//			for(int l=1; l<i; l++)
//			{
//				System.out.print(a.charAt(p));
//			}
//			System.out.println();
//		}
		
		
//		------------------------------------------
		
//		Hallow Diamond shape in Ractangle
		
//		int b=5;
//		
//		for(int i=b; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			for(int k=i; k<b; k++)
//			{
//			System.out.print(" ");
//			}
//			for(int l=i; l<b; l++ )
//			{
//				System.out.print(" ");
//			}
//			for(int m=1; m<=i; m++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		int a=5;
//		for(int i=1; i<=a; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			for(int j=i; j<a; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i; k<a; k++)
//			{
//				System.out.print(" ");
//			}
//			for(int l=1; l<=i; l++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

	}	

