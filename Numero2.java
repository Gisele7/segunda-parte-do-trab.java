
public class Numero2 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 1 ;
		int x = 0;
		
		
		System.out.print("a | b | c | x \n ");
		System.out.print("---------------  \n");
		
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x 	);
		
		x = --b - b-1;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		c = a/b;
		System.out.printf("%d | %d | %d | %d \n" ,  a, b, c, x );
		
		a += x + c * b++;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		c = ++x + x *3 + x;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		c = --x * 4 /b;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		a /= --b;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		x *= c++;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);
		
		a = (--b *c) + (c++ - b); 
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x );
		
		++x;
		System.out.printf("%d | %d | %d | %d \n" , a, b, c, x);


		
			
	}

}
