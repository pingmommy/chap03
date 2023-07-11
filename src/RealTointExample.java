
public class RealTointExample {

	public static void main(String[] args) {

		int apple =1;
		double pieceUnit = 0.1;
		
		double result = apple - 7*pieceUnit; // 0.3을 예측했으나..
		
		System.out.println(result);
		
		int apple2 =10;        // 높은 정밀도가 요구될 땐 정수연산을 해야 한다. 
		int pieceUnit2 = 1;
		
		int result2 = apple2 - 7*pieceUnit2;
		System.out.println(result2/10.0);

	}

}
