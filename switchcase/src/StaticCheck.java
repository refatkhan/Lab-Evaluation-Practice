package switchcase.src;

class Student {
    static String uni = "diu";

    void display(int a, int b) {
        System.out.println("from method: " + uni);
        System.out.println("Sum is: " + (a + b));
    }

    void display(int a, int b, int c) {
        System.out.println("the multiplication of three: " + (a * b * c));
    }

    static void display2() {

        System.out.println("call from static method: " + uni);
    }
}

class Person {

    private String name;
    private String ID;
    // Person(String name, String ID){
    // this.name = name;
    // this.ID = ID;
    // }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void displayInfo() {
        System.out.println("Name is: " + name);
        System.out.println("ID: " + ID);
    }

}

public class StaticCheck {
    public static void main(String[] args) {
        System.out.println(Student.uni);
        Student student = new Student();
        student.display(5, 6);
        student.display(1, 2, 3);
        Student.display2();
        Person person = new Person();
        person.setName("null");
        System.out.println(person.getName());
        person.displayInfo();
    }
}
