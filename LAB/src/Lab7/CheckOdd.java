package Lab7;

public class CheckOdd {
    void checkOdd(int n) throws OddException {
        if(n%2 != 0) {
            throw new OddException(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
}
