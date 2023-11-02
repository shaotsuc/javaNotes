public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.")
    }

    //getting private age key
    public int getAge() {
        return this.age;
    }

    // getting new age input
    public int setAge(int age) {
        this.age = age;
    }
}


//then can call the class
//example
public class Main {
    public static void main(String[] args) {
    // calling the class
    Person tom = new Person("Tom", 12);
    tom.speak();
    }
}