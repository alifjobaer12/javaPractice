class person{
    String name;
    person(String name){
        this.name=name;
    }
    void introduce(){
        System.out.println(name);
    }
}
class employee extends person{
    String name;
    employee(String f, String s){
        super(f);
        this.name = s;
    }
    @Override
    void introduce(){
        super.introduce();
        System.out.println(name);
    }
    void showName(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

public class class_13_08_25 {
    public static void main(String[] args) {
        employee e = new employee("John","Doe");
        e.showName();
        e.introduce();
    }
}
