abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); 
        myDog.sleep();  
    }
}
