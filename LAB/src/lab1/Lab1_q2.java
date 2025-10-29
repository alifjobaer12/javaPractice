package lab1;// import java.lang.Character.Subset;
import java.util.*;

public class Lab1_q2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int num = a.nextInt();
        int n=num;

        int ctn=0;
        while (num>0) {
            num /= 10;
            ctn++;
        }
        int[] arr = new int[ctn];
        int[] arr2 = new int[ctn];

        for(int i=0; i<ctn; i++) {
            arr[i] = n%10;
            n /= 10;
            // System.out.println(num+" "+t);
        }

        for(int i=0,j=ctn-1; i<ctn; i++, j--) {
            arr2[j] = arr[i];
            // n /= 10;
            // System.out.println(num+" "+t);
        }

        for(int i=ctn-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<ctn; i++) {
            System.out.print(arr2[i] + " ");
        }
        a.close();
    }
}
