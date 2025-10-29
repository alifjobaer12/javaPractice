package lab4;

class employee{
    void work() {
        System.out.println("work");
    }
    void getSalary() {
        System.out.println("getSalary");
    }
}

class HRManager extends employee{

    @Override
    void work() {
        System.out.println("newWork");
    }
    void addEmployee() {
        System.out.println("addEmployee");
    }
}

public class Lab4_q2 {
    public static void main(String[] args) {
        HRManager hrm = new HRManager();
        hrm.work();
        hrm.getSalary();
        hrm.addEmployee();
    }
}
