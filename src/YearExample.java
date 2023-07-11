
public class YearExample {
	
	public static void main(String[] args) {
		int Year = (int)(Math.random()*5000 +1);
        System.out.println(Year);
        
        String leap = (Year%4 ==0 && Year%100 !=0 || Year%400 ==0)? "윤년" : "평년";
	
		
	}
	
	
	
	public static void main3(String[] args) {
		double oneYear = 365.2422;

		double tenYear = oneYear *100;
		
		System.out.println(tenYear);
	
		System.out.println(366*25 + 365*75);

	}
	
	
	public static void main2(String[] args) {

		double oneYear = 365.2422;
		
		double fourYear = oneYear * 4;
		
	}

}
