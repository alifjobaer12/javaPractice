package lab3;

import java.util.*;

class Application{
    String model, con;
    int pow;
    Application(String m, int p, String c) {
        model = m;
        con = c;
        pow = p;
    }
    Application(String m, int p) {
        model = m;
        // con = c;
        pow = p;
    }
    Application( int p, String c) {
        // model = m;
        con = c;
        pow = p;
    }
    void display() {
        if(pow<=120) {
            System.out.println("M-"+model+"\n"+"P-"+pow+"W"+"\n"+"C-"+con);
            System.out.println("EcoFrindly");
        }
        else {
            System.out.println("M-"+model+"\n"+"P-"+pow+"W"+"\n"+"C-"+con);
            System.out.println("Not EcoFrindly");
        }
    }
}

public class Lab3_q1 {
    public static void main(String[] args) {
        // System.out.println("alif");
        Scanner in = new Scanner(System.in);

        Application ob1 = new Application("Al12",12,"wifi");
        Application ob2 = new Application(12,"wifi");
        Application ob3 = new Application("Al12",1200);

        ob1.display();
        System.out.println();
        ob2.display();
        System.out.println();
        ob3.display();
        System.out.println();

        in.close();


    }
}
