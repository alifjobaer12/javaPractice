package lab1;

import java.util.*;

public class Lab1_q1 {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int sum = 0, mn = 10000000;
        // System.out.println(n);

        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
            sum += arr[i];
            if (arr[i] < mn) {
                mn = arr[i];
            }
        }

        System.out.println(mn);
        System.out.println(sum);

        Lab1_q1 s = new Lab1_q1();
        // int t = s.sum(1, 2);
        System.out.println(s.sum(1,2 ));
        // for(int j=0; j<n; j++) {
        // System.out.println(arr[j]);
        // }
        a.close();
    }

}
