
public class Exercise8 {
	
	
	public static void main8(String[] args) {
		String str = "yes";
		if("yes".equals(str)) {
			System.out.println(true);
		}
	}
	
	
	
	
	public static void main7(String[] args) {
		boolean powerOn = false;
		if(powerOn == false) {
			System.out.println(true);}
	
	}
	
 public static void main6(String[] args) {
		int year = 1223;
		
		if(year%400==0 || year%3==0 && year !=100 ) {
			System.out.println(true);
			}
		
		else System.out.println(false);
	
	}
	
	

	
	
	public static void main1_5(String[] args) {
		char ch = '%';
		
		if(ch>=65 && ch<=90) {
			System.out.println(true);
		}
		else if(ch>=(65+35) && ch<=(90+35)) {
			System.out.println(true);
		}
		else System.out.println(false);
	
	}
	
	public static void main1_4(String[] args) {
		char ch = '*';
		
		if(ch>=48 && ch<=57) {
			System.out.println(true);
		}
		
		else System.out.println(false);
	
	}

	public static void main1_3(String[] args) {
		char ch = 'X';
		
		if(ch == 'x') {
			System.out.println(true);
		}
		else if(ch == 'X') {
			System.out.println(true);
		}
		else System.out.println(false);
	
	}
	
		public static void main2(String[] args) {
	
		char ch = ' ';
	
		if(ch == ' '|| ch == '\t') {
			System.out.println(false);
	     }
		else System.out.println(true);
	}

}
