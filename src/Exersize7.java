
public class Exersize7 {
	
	public static void main(String[] args) {
		int fahrenheit =100;
		float celcius =5/9*(fahrenheit -32)*3778;
		
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
	
	public static void main6(String[] args) {
		int num =81;
		System.out.println(((num%10)-10)*-1);
	}
	
	public static void main4(String[] args) {
		int num = 456;
		System.out.println(num/100*100);
	}
	
	
	
	public static void main3(String[] args) {
		int num = 10;
		System.out.println(num == 0? 0 : (num>0)?"양수":"음수" );
	}
	
	public static void main2(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket =10;
		int numOfBucket =(numOfApples/sizeOfBucket)+1;
		
		System.out.println(numOfBucket);
	}

	

	public static void main1(String[] args) {


		int x = 2;
		int y = 5;
		
		char c = 'A';  //65 
		
		System.out.println(1+x<<33);
		System.out.println(y>=5||x<0&&x>2);
		System.out.println(y +=10 -x++);
		System.out.println(x+=2);
		System.out.println(!('A'<=c&& c<='Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);


		
		
	}

}
