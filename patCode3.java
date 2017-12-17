import java.util.Scanner;

public class patCode3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int countA =  0 ;
		int dp1 = 0;
		int dp2 = 0; 
		for(int i =  0 ; i< s.length(); i++){
			if(s.charAt(i)== 'a'){
				countA ++;
				dp1 = Math.max(dp1, dp2) +1;
			}else{
				dp2 = Math.max(dp2, countA)+1;
			}
			
		}
		System.out.println(Math.max(dp1, dp2));
	}
}