package lab3;

class employees{
    String name, address, jobTitel;
    int salary;
    void bonus() {
        System.out.println("You access this");
    }
    void report() {
        System.out.println("You access this");

    }
    void project() {
        System.out.println("You access this");

    }
    void display() {
        System.out.println(name+"\n"+address+"\n"+salary+"\n"+jobTitel);
    }
}

class manager extends employees{
    manager(String n, String a, int s, String jp) {
        name = n;
        address = a;
        salary = s;
        jobTitel = jp;
    }
}
class devloper extends employees{
    devloper(String n, String a, int s, String jp) {
        name = n;
        address = a;
        salary = s;
        jobTitel = jp;
    }
}
class programmer extends employees{
    programmer(String n, String a, int s, String jp) {
        name = n;
        address = a;
        salary = s;
        jobTitel = jp;
    }
}

public class Lab3_q3 {
    public static void main(String[] args) {
        manager m = new manager("Alif", "Dhaka", 100000, "Leader");
        devloper d = new devloper("Alif", "Dhaka", 100000, "Leader");
        programmer p = new programmer("Alif", "Dhaka", 100000, "Leader");

        m.display();
        m.bonus();
        m.report();
        m.project();
        System.out.println();

        d.display();
        d.bonus();
        d.report();
        d.project();
        System.out.println();

        p.display();
        p.bonus();
        p.report();
        p.project();
        System.out.println();
    }
}
