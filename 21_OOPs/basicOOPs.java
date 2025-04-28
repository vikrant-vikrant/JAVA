
public class basicOOPs {

    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColour("red");
        // p1.setTip(3);
        // p1.colour = "blue";
        // p1.tip = 5;
        // System.out.println(p1.colour);
        // System.out.println(p1.tip);

        // p1.setColour("red");
        // p1.setTip(5);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        Pen p3 = new Pen();
        Pen p2 = new Pen("pink", 5);
        System.out.println(p2.getColor());
        System.out.println(p2.getTip());

        Student s1 = new Student();
        s1.age = 21;
        s1.name = "vikrant";
        s1.percentage = 9;
        s1.calcPercentage(21, 34, 23);
        // System.out.println(s1.age);
        // System.out.println(s1.name);
        // System.out.println(s1.percentage);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "vikrnat";
        myAcc.setPassword("kaka");
    }
}

class Pen {

    private String colour;
    private int tip;

    String getColor() {
        return this.colour;
    }

    int getTip() {
        return this.tip;
    }

    void setColour(String newColour) {
        colour = newColour;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    Pen(String colour, int tip) {
        this.colour = colour;
        this.tip = tip;
    }

    Pen() {
        System.out.println("Constructor is called...");
    }
}

class Student {

    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int che, int mat) {
        percentage = (phy + che + mat) / 3;

    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
