
public class Main {
	public static void main(String[] args) {
		int x = 4;
		int y = 6;
		
		int sum = x + y;
		System.out.println(sum);
		sum = x++ + y;
		System.out.println(sum);
		x = 4;
		sum = x + ++y;
		System.out.println(sum);
	}
}
