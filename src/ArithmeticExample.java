
public class ArithmeticExample {

	public static void main(String[] args) {
		
		/*
		 * epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간 
		 *
		 * GMT, UTC  (우리나라는 9시간 빨리간다.)
		 * */

// current를 근거로 year, month, day 를 구해보세요.
		
		
		long current = System.currentTimeMillis()/1000; // 초로 변환
		long hour = current/60/60%24+9;
		long minute = current/60%60;	
		long second = current%60;
				
		System.out.println(current);
		System.out.printf("%02d : %02d : %02d",hour,minute,second);

	}

}
