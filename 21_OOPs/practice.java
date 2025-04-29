
public class practice {

    public static void main(String[] args) {
        Student s1 = new Student("vikrant", 21, "abcd123");
        s1.setPassword("abc");

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // System.out.println(s1.getPassword());

        Student s2 = new Student(s1);
        s2.setPassword("def");
        s1.marks[2] = 100;

        // System.out.println(s2.marks[0]);
        // System.out.println(s2.marks[1]);
        // System.out.println(s2.marks[2]);

        Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breath();
    }
}

class Student {

    public String name;
    int roll;
    private String password;
    int marks[];

    //shallow copy construtor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }
    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    public Student() {
        marks = new int[3];
        System.out.println("constructor is called..");
    }

    public Student(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
        marks = new int[3];

    }

    String getPassword() {
        return this.password;
    }

    void setPassword(String pass) {
        password = pass;
    }
}
//Base class
class Animal {
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breath");
    }
}
//Derive class
class Fish extends Animal {
    int Fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
