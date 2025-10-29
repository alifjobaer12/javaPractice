package Contest.problem1.p2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        Set<Long> h=new HashSet<>();
        for(int i = 0; i < n; i++){
            h.add(sc.nextLong());
        }
        System.out.println(h.size());
    }
}
