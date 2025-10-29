package lab5;

interface Printable {
    void print();
}

class Scaner implements Printable {
    public void print() {
        System.out.println("Print");
    }
}

class Printer implements Printable {
    public void print() {
        System.out.println("Print");
    }
}

public class Lab_5_q1 {
    public static void main(String[] args) {
        Scaner s = new Scaner();
        s.print();

        Printer p = new Printer();
        p.print();
    }
}
