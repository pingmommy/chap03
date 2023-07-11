
public class ComplexAssignmentExample {

	public static void main(String[] args) {


		int num=100;
		
		num+=10; //num =num +10;
		
		System.out.println(num);
		
		int num2=100;
		
		num2 *=2+3; // <-연산의 우선순위 (2+3) -> *num
		
		System.out.println(num2);
	}

}
