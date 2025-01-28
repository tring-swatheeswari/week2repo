class Swathi {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;  
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Swathi swathi = new Swathi();
        swathi.setName("Swatheeswari");
        swathi.setAge(21);
        System.out.println("Name: " + swathi.getName());
        System.out.println("Age: " + swathi.getAge());
    }
}