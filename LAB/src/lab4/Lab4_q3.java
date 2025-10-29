package lab4;

class person {
    void getFirstName() {
        System.out.println("FirstName");
    }

    void getLastName() {
        System.out.println("LastName");
    }
}

class Employee extends person {
    void getEmployeeld() {
        System.out.println("lab4.Employee");
    }

    @Override
    void getLastName() {
        super.getLastName();
        System.out.println("Manager");
    }
}

public class Lab4_q3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getFirstName();
        e.getLastName();
        e.getEmployeeld();
    }
}
