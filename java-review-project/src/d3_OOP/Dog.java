package d3_OOP;

public class Dog extends Animal {

    // Dog is an Animal
    // Dog has a name

    public Dog (String name) {
        super(name);
    }

    @Override
    public String getName(){
        return "Dog's name is " + name;
    }

    @Override
    int getNum() {
        return 20;
    }

    public static void main(String[] args) {
        Dog dog = new Dog(("Jack"));
        System.out.println(dog.getName());
        Animal a = new Animal("Joe");
        System.out.println(a.getName());

        System.out.println(dog.getNum());
    }
}
