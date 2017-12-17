import java.util.*;

public class MathShow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		int[] t = new int[k];
		long sum = 0;
		for(int i=0;i<k;i++) {
			t[i] = sc.nextInt();
			sum += t[i]; 
		}
		Arrays.sort(t);
		
		int max = -1;
		for(int i=0; i<=n; i++) {
			int points = i*(k+1);
			long rem = m - i*sum;
			if (rem < 0) continue;
			for(int j=0;j<k;j++) {
				int picks = Math.min(n-i, (int)rem/t[j]);
				if (picks == 0) {
					break;
				}
				points += picks;
				rem -= picks * t[j];
			}
			max = Math.max(max, points);
		}
		System.out.println(max);
		
	}
	
}