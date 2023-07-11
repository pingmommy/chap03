
public class TerneryOperatorExample {
	
public static void main2(String[] args) {
		
		double w = Math.random() ; // 0 ~ 1 미만의 수만 출력
	
		System.out.println(w);		
		System.out.println((int)(w*100));
		System.out.println((int)(w*80)); // 80 이하의 수만 출력
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100);
			
		System.out.println(num);
		System.out.println(num%2==0?"짝수":"홀수");
	}
}
