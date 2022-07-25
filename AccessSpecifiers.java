//Default Access modifiers
package defaultPackage;
class AccessSpecifiers {
    void message(){
        System.out.println("This is default access modifier.");
    }
}


//Private access modifiers
class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class AccessSpecifiers {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("private modifier");
        System.out.println(d.getName());
    }
}

//Protected access modifier

class Employee {
    // protected method
    protected void display() {
        System.out.println("I am Employee");
    }
}

class AccessSpecifiers extends Employee
 {
    public static void main(String[] args) {

        // create an object of AccessSpecifiers class
        AccessSpecifiers obj1 = new AccessSpecifiers();
         // access protected method
        obj1.display();
    }
}

//public access modifier

public class Animal {
    // public variable
    public int legCount;

    // public method
    public void display() {
        System.out.println("I am an animal.");
        System.out.println("I have " + legCount + " legs.");
    }
}


public class AccessSpecifiers {
    public static void main( String[] args ) {
        // accessing the public class
        Animal animal = new Animal();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}
