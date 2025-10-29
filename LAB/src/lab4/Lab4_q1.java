package lab4;

class animal{
    void makeSound() {
        System.out.println("hi!");
    }
}

class cat extends animal{

    @Override
    void makeSound() {
        System.out.println("MeOw!");
    }
}

public class Lab4_q1 {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.makeSound();
    }
}
