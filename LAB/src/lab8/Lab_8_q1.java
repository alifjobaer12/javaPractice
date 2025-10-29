package lab8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab_8_q1 {
    static int countUniqueElement(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for(int val: arr) s.add(val);
        return s.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = scanner.nextInt();
        System.out.println(countUniqueElement(arr));
    }

}

q