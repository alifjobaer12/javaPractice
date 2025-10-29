package lab8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_8_q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.nextLine();
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(m);
    }
}
