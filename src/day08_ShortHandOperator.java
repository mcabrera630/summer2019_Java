
public class day08_ShortHandOperator {
	
	public static void main(String[] args) {
		 
		// Task01: write a java program that converts gallon to liter 1 gallon = 3.785
		
		int gallon = 100; 
		double liters = gallon * 3.87; // converts gallons to liters 
		
		System.out.println(gallon +" gallons equal to " + liters + " liters");
		
		//task02 write a java program that converts liters to gallon
		
		double L = 1;
		double G = L / 3.785; 
		System.out.println(L +" liters equal to " + G + " gallon ");
		
		//in class task 
		
		int x = 2;
		int y = x++; 
		System.out.println(y+ " "+x);
		
		int x2 = 2; 
		System.out.println( x2++ );
		System.out.println( x2 );
		
		int x3 = 2; 
		System.out.println( --x3);
		
		int x4 = 8;
		int y4 = x4--; 
		System.out.println( y4 );
		System.out.println( x4 );
		
		/* 
		 += : addition assignment: x + y ==> x = x + y 
		 -= : subtraction: x -= y ==> x= x-y 
		 *= : multiplication assignment: x *= y ==> x= x*y
		 /= : division assignment: x /= y ==>  
		 %= : remainder assignment: x % y ==> 
		*/
			int a= 9; 
			a += 3; 
			System.out.println(a);
			
			int b = a+=5;
			System.out.println(b);
		
		int c = a += b ; // a= 34, c= 34, b =17
		System.out.println(c);
		
		int d = a += c; // a= 68, d= 68, c=34, b=17 
		System.out.println(d);
		
		int e = (d+=b) * 2; 
		
		System.out.println(e);
		
		int f = b += d * 2; 
		System.out.println(f);
		
		System.out.println("=====================");
		// int a = 1;  a= -a-- + a++ / -a-- * --a
				//         -1 + 0 / -1 * -1 
		
		int g = 101; 
		int h = g -= 1; 
		//      101 - 1 ==> 
		System.out.println(h);
		
		int i = g+=h+5; 
				System.out.println(i);
				
		int j = h+= g % i; 
		// 100 += 205 % 205 
		// 100 += 0
		System.out.println(j);
		
		
		int k = j -= h * 2 % 5; 
		// j -= 200 % 5 
		// 100 -= 0 
		System.out.println(k);
		System.out.println("=====================");
		
		int A = 100; 
		A *= 200;
		System.out.println(A); // A = 20000
		
		int B = 100;
		B *= 100 / 10;
		//B *= 100 / 10 
				System.out.println(B);
				
		B *= B-=1000; 
		// B8 =(1000 - 1000) = 0 
		System.out.println(B);
		
	System.out.println("====================");
	
	int C = 1000; 
	C /= 5; 
	System.out.println(C );
	
	int D = 10; 
	// C /= D - 10; denominator cannot be zero
	
	C /= D + 10;
	// 1000 /= 10 + 10 
	//200 /= 20 
	// 10 
	
	System.out.println("===================");
	
	int z = 10%3; // ==> 10/3 += 3.3333 
	// remainder 10 - 3 * 3 = 
	//1 
	System.out.println(z);
	int E = 10; 
	E %= 2; // E = 10%2
	// 0 
	System.out.println(E);
	
	int F = 100; 
	F %= 2; // F = F%2; ==> 0 
	System.out.println(F);  // if its zero means its an even number );
	
	System.out.println(10.5 % 3 );
	
	int J = 300; 
	int K = 10; 
	
	J += J%=K; 
	
		
		
		
		
		
		
		
		
		
	}

}
