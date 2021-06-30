public class Dog {
    String name;
    int age;
    String woof;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog max = new Dog("Bob");
        max.woof();

    }

    public void woof() {
        System.out.println("Dog " + name + " say \"Woof! Woof!\"");
    }

    public void age(int years) {
        System.out.println("Dog " + name + " age " + years + " years");
    }

    public String getName() {
        return name;
    }
}
