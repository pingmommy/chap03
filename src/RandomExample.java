
public class RandomExample {

	public static void main(String[] args) {

		//1. 주사위를 던진다. (1 -6까지 출력되게)
		//[0-5]+1
		//System.out.println((int)(Math.random()*6)+1);
		
		//2. 30-37까지 출력되게 
		//[0-7]=30
		//System.out.println((int)(Math.random()*8)+30);
		
		//A65- Z90 대문자 알파벳구하기  
		//System.out.println((int)(Math.random()*26)+65);
		//System.out.println((char)((Math.random()*26)+65));
		
		//a97- z 소문자 알파벳구하기 
		//System.out.println((int)(Math.random()*26)+97);
		//System.out.println((char)((Math.random()*26)+97));
		
		//1-45
		System.out.println((int)(Math.random()*45)+1);




	}

}
