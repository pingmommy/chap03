
public class NanNInfinityExample {

	public static void main(String[] args) {


		int num1 = 5;
		int num2 = 0;
		
		// int result = num1/num2;  오류 
		
		double d1 =5;
		double d2 =0;
		
		double result2= d1/d2; // infinity
		double result3= d1%d2; // NaN

		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(Double.isInfinite(result2));
		System.out.println(Double.isNaN(result3));
		System.out.println(result3==Double.NaN); // NaN는 == 연산을 쓰면 안 된다. 
		System.out.println(result2==Double.POSITIVE_INFINITY);

		/*
		 * 0.0/0.0  , 5%0.0 >> NaN
		 * */
		

	}

}
