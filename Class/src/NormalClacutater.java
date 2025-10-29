import java.util.*;

class calculator{
    int x, y;
    calculator(int a, int b) {
        x = a;
        y = b;
    }
    int sum() {
        return x+y;
    }
    int sub() {
        return x-y;
    }
    int mul() {
        return x*y;
    }
    int div() {
        return x/y;
    }
}

public class NormalClacutater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char s;
        a = sc.nextInt();
        s = sc.next().charAt(0);
        b = sc.nextInt();

        calculator cal = new calculator(a,b);
        switch (s) {
            case '+':
                System.out.println(cal.sum());
                break;
            case '-':
                System.out.println(cal.sub());
                break;
            case '*':
                System.out.println(cal.mul());
                break;
            case '/':
                System.out.println(cal.div());
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }

        sc.close();
    }
}
