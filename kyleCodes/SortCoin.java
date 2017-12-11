import java.util.Scanner;

public class SortCoin {
	
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt(), j=n-1;
		boolean[] vCoins = new boolean[n];
		StringBuilder sCoins = new StringBuilder("1");
		
		for (int i=0; i<n; i++) {
			
			vCoins[kbd.nextInt()-1] = true;
			while ((j>=0) && (vCoins[j])) j--;
			sCoins.append(" " + (i-n+j+3));
			
		}
		System.out.println(sCoins);
		kbd.close();
	}
}