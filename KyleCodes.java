public class KyleCodes{
	
	public void SortCoin {
		
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
	public void Polycarp {
        Scanner kbd = new Scanner(System.in);

        int i = 0, answer = 0;
        int n = kbd.nextInt();
        String s = kbd.next();

        while (i != s.length()) {
            if (!Character.isLowerCase(s.charAt(i))) {
                ++i; continue;
            }

            Map<Character, Integer> uniques = new TreeMap<>();

            int j = i;

            while (j != s.length() && Character.isLowerCase(s.charAt(j))) {
                uniques.put(s.charAt(j), 1);

                ++j;
            }

            if (uniques.size() > answer) {
                answer = uniques.size();
            }

            i = j;
        }

        System.out.println(answer);
    }
	public void MaxSplit{
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