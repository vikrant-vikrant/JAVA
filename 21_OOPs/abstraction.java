
public class abstraction {

    public static void main(String[] args) {
        // Abstraction
// Hiding all the unnecessary details and showing only the important parts to the user.
//(i)Abstract Classes - > inheritance , (ii)Interfaces
// - Cannot create create an instance of abstract class
// - Can have abstractlnon-abstract methods
// - Can have constructors
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // System.out.println(c.changeColor());

//   Interfaces -> implements
// - All methods are public, abstract & without implementation
// - Used to achieve total abstraction
// - Variables in the interface are final, public and stat;
        Queen q = new Queen();
        q.moves();

// Static Keyword
// static keyword in Java is used to share the same variable or method of a
// given class.
// - Properties
// - Functions
// - Blocks
// - Nested Classes
    Student s1 = new Student();
    s1.schoolName = "JMV";

    Student s2 = new Student();

    Student s3 = new Student();
    s3.schoolName = "ABC";
    System.out.println(s2.schoolName);

//  Super Keyword
// super keyword is used to refer immediate parent class object.
// - to access parent's properties / functions / constructor
    
    }
}

abstract class Animal {

    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }

    // Animal() {
    //     color = "brown";
    // }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    public Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    public Chicken() {
        System.out.println("Chicken constructor called");
    }

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("Up,down, left, right, diagonal(in all 4 diractions)");
    }
}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("Up,down, left, right");
    }
}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("Up,down, left, right ,diagonal(by 1 step)");
    }
}

class Student {
    String name;
    int roll;

    static int percentage(int math,int che,int phy){
        return (math  + che + phy)/3;
    }

    static String schoolName;

    void getName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
