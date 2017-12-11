import java.util.*;
public class MaxSplit{
	public static void main(String args[]){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		kbd.nextLine();

		int[] q = new int[n];
		for(int i = 0; i < n; i++){
			q[i] = kbd.nextInt();
			kbd.nextLine();
		}

		for(int i = 0; i < n; i++){
			int x = 0;
			if(q[i] == 2 || q[i] == 3 || q[i] == 5 || q[i] == 7 || q[i] == 11) x = -1;
			else if(q[i] % 4 == 0 || q[i] % 4 == 2){
				x = q[i]/4;
			}
			else if(q[i] % 4 == 1 || q[i] % 4 == 3){
				x = q[i]/4 - 1;
			}
			System.out.println(x);
		}
	}
}