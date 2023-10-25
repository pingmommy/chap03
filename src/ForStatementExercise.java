
public class ForStatementExercise {
	
	
	
		 

 public static void main(String[] args) {
	 int sum=0; 
	 int i;
	 
	 for(i=1;sum<100; i++) {
	     System.out.println("i="+i);

		 if(i%2==0) {
			 sum+=(-i);
			 System.out.println(i);
			 System.out.println("even ="+sum);
		 }
		else 
		 {
		 sum += i;	
	     System.out.println(i);
		 System.out.println("odd="+sum);
		}
		
	 }
    

	 
	//System.out.println(i-1);
	
}
	
	
	
	
	public static void main2(String[] args) {

		
		int i,j, sum=0;
		int count =0;
		
		for(i=1;i<=10;i++) {
			//System.out.print("i= "+i+ " ");
			//count++;
			//System.out.println("count="+count);
			
			System.out.println("count="+ i);
			System.out.print("j= ");
			for (j=1;j<=i;j++) {
				System.out.print(j + "+ ");
				sum+=j;
			}
			System.out.println("sum="+sum);

			System.out.println( );

		}
}
	
public static void main3(String[] args) {
		int i, sum=0;
		int total =0;
		
		for(i=1;i<=10;i++) {
			sum +=i;
			total += sum;
		}
}
}
