import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp !=0) {
			result *= 10;
			result += tmp%10;
			tmp /=10;
		}
		
		if(result == number) {
			System.out.println(number + "회문수입니다. ");
			
		}
		else 
			System.out.println(number + "회문수가 아닙니다.");
	}

}
