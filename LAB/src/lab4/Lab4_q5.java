package lab4;

abstract class student {
    abstract void study();
}

class SchoolStudent extends student {
    @Override
    void study() {
        System.out.println("School Student Study Basic Subject.");
    }
}

class CollegeStudent extends student {
    @Override
    void study() {
        System.out.println("College Student Study Basic Subject.");
    }
}

public class Lab4_q5 {
    public static void main(String[] args) {
        student s;

        s =  new SchoolStudent();
        s.study();

        s =   new CollegeStudent();
        s.study();

    }
}
