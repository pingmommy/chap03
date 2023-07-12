
public class dddd {

	public static void main(String[] args) {

		
		int i,j;
		int s1=0 , s2=0, s3=0;
		
		for(i=1;i<200;i+=2) {
			System.out.println(i);
			s1+=i;				  
		}
		
		for( j =2;j<200;j+=2) {
			//System.out.println(j);
			s2+=j;
			
		}
		
		s3=s1+(s2*-1);
		//System.out.println(s3);
		
	}

}
