package lab3;

class vaicel {
    String model, fualType;
    int year;
    void fualEfficency() {
        System.out.println("This veival is Fual Efficent *_*");
    }
    void destencTravel() {
        System.out.println("It can travel How many you want >_<");
    }
    void maximumSpeed() {
        System.out.println("If you hit top speed than you see the sun ¬_¬");

    }
    void display() {
        System.out.println("Model: "+model+"\n"+"Relese Year: "+year+"\n"+"Fual Type: "+fualType);
    }
}
class car extends vaicel{
    car(String m, int y, String ft) {
        model = m;
        year = y;
        fualType = ft;
    }
}
class truk extends vaicel{
    truk(String m, int y, String ft) {
        model = m;
        year = y;
        fualType = ft;
    }
}
class motorcycle extends vaicel{
    motorcycle(String m, int y, String ft) {
        model = m;
        year = y;
        fualType = ft;
    }
}
public class Lab3_q2 {
    public static void main(String[] args) {
        car vc1 = new car("M-car1", 2025, "dissel");
        truk vt1 = new truk("M-car1", 2025, "dissel");
        motorcycle vm1 = new motorcycle("M-car1", 2025, "dissel");

        vc1.display();
        vc1.fualEfficency();
        vc1.destencTravel();
        vc1.maximumSpeed();
        System.out.println();

        vt1.display();
        vt1.fualEfficency();
        vt1.destencTravel();
        vt1.maximumSpeed();
        System.out.println();

        vm1.display();
        vm1.fualEfficency();
        vm1.destencTravel();
        vm1.maximumSpeed();
        System.out.println();
    }
}

