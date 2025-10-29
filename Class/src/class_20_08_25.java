class Person {
    int age;
    void showType() {
        System.out.println("This is a person");
    }
    void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    @Override
    void showType() {
        System.out.println("This is a student");
    }
}

class Teacher extends Person {
    @Override
    void showType() {
        System.out.println("This is a teacher");
    }
}

public class class_20_08_25 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showType();
        s1.setAge(25);
        System.out.println(s1.age);

        Teacher t1 = new Teacher();
        t1.showType();
        t1.setAge(35);
        System.out.println(t1.age);
    }
}
