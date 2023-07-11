
public class BitShiftExample {
      
	public static void main(String[] args) {

		int num1 =0b0000_0001;
		
		int result1 = num1<<1;

		/*
		 *  00000001                                                       0000 0000 0000 0011
		 *  << 1
		 * ==========
		 *  00000010
		 */
		int result2 = num1<<2;

		/*
		 *  00000001
		 *  << 2
		 * ==========
		 *  00000100
		 */
		int result3 = num1<<4;

		/*
		 *  00000001
		 *  << 1
		 * ==========
		 *  00010000
		 */
		

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		int e = 0b1000_0000;
		// >>1  -> 1100_0000   >>  << 산술쉬프트(부호를 고려함)
		//>>>1  -> 0100_0000   >>>(부호를 고려하지 않음)

	}

}
