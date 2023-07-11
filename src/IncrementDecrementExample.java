
public class IncrementDecrementExample {

	public static void main(String[] args) {


		int num3 = 10;
		int num4 = 20;
		
	    int z = (++num3) + (num4--);
		int z2= num3+num4;
	    //System.out.println(num3);
	    //System.out.println(num4);
		//System.out.println(num3+num4+z);
		
		
		System.out.println(z);
		System.out.println(z2);

		
		
	}
	
	public static void main4(String[] args) {


		int num3 = 10;
		int num4 = 10;
		
	
		System.out.println(++num3);
		System.out.println(num4++);
		System.out.println(num4);
		
		
	}
	
	
	
	public static void main3(String[] args) {


		int num = 10;
		int num2 = 10;
		
		int result1 =++num + 10; //21
		
		int result2 = num2++ + 10; //20 
		
		
		System.out.println(result1);
		System.out.println(result2);
		
		
	}
	
	
	
	
	
	
	
	public static void main2(String[] args) {


		int num = 10;
		++num; // num=num+1;
		System.out.println(num);
		
		num++; 
		System.out.println(num);
		
		
	}

}
