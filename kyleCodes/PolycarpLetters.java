import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class PolycarpLetters {
    public static void main(String[] args) {
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
}