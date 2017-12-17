import java.util.*;

public class patCode2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		int n=scan.nextInt();
	
		for(int i=0;i<n;i++) {
			String temp=scan.next();
			if(a.contains(temp)){
			System.out.println("YES");
			}else {
			System.out.println("NO");
			a.add(temp);
			}
		}
	}
}