package Contest.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        Long sum = 0L;
        boolean ctn = true;
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(a[i]-25 <= sum ) {
//                ctn = true;
                sum += 25;
            } else {
                ctn = false;
                break;
            }
//            sum += a[i];
        }
        if(ctn){
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}
