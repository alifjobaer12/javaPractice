package MID_EXAM.Q2;

public class MathOperation implements Operation {
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void multiply(int a, int b) {
        try{
            int c = a/b;
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a*b);
    }
}
