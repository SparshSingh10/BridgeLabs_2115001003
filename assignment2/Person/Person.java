public class Person {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person(Person copy) {
        this.age = copy.age;
        this.name = copy.name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name = " + name + "\n Age " + age);
    }

    public static void main(String[] args) {
        Person ob1 = new Person("Rahul", 22);
        Person ob2 = new Person(ob1);
        ob1.display();
        ob2.display();
    }
}
