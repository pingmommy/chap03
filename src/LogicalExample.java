
public class LogicalExample {

	public static void main(String[] args) {
		System.out.println("#####");
		System.out.println("#AND");
		System.out.println("#####");
		System.out.println("t&&t=" + (true&&true));
		System.out.println("t&&f=" + (true&&false));
		System.out.println("f&&t=" + (false&&true));
		System.out.println("f&&f=" + (false&&false));

		
		System.out.println("#####");
		System.out.println("#or");
		System.out.println("#####");
		System.out.println("t||t=" + (true||true));
		System.out.println("t||f=" + (true||false));
		System.out.println("f||t=" + (false||true));
		System.out.println("f||f=" + (false||false));

		System.out.println("#####");
		System.out.println("#xor"); // 양쪽 항이 다를 때 true
		System.out.println("#####");
		System.out.println("t^t=" + (true^true));
		System.out.println("t^f=" + (true^false));
		System.out.println("f^t=" + (false^true));
		System.out.println("f^f=" + (false^false));
		
		

	}

}
