
public class abstraction {

    public static void main(String[] args) {
        // Abstraction
// Hiding all the unnecessary details and showing only the important parts to the user.
//(i)Abstract Classes , (ii)Interfaces
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


//   Interfaces
// - All methods are public, abstract & without implementation
// - Used to achieve total abstraction
// - Variables in the interface are final, public and stat;
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
