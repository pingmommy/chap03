
public class EpochTimeExample {

	public static void main(String[] args) {  //>>초단위(/1000)로 바꿔라.
		long epoch = System.currentTimeMillis()/1000+9*60*60;  
		                                          //>>9*60*60 우리나라는 9시간을 더해야 하고
		System.out.println(epoch);                // 단위를 맞추기 위해 초단위로 환산. 
		
		int year = 1970;
		for (;;) {
		   boolean isleap = (year%4==0 && year!=100)||(year%400 ==0);
		   int daysOfYear = isleap ? 366:365;
		   if(epoch - daysOfYear*24*60*60 >=0) {
			   epoch = epoch -daysOfYear*24*60*60;
			   year++;
			   continue;
		   }
		   //else 
			 
		   break;
		}
		
		System.out.println(year);
		System.out.println(epoch); 
		
		long mm = epoch/60/60L;
		
		long dd = mm/24L;
		
		int mon = (int)dd/30;
		
		
		
		System.out.println(mon);
	}

}
