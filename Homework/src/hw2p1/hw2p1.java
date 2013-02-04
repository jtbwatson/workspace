package hw2p1;

public class hw2p1 {
	
	public static void main(String[] args) {
	
		char [][] a = { {'a', 'b', 'c', 'd'},
						{'z', 'y', 'x', 'w'},
						{'0', '1', '2', '3'} };
		
		String [] b = new String[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = "";
		}
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				b[i] += a[i][j] + "";
				System.out.print(b[i]);
				System.out.println();
				
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

