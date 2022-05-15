class Car {
    private String name ;
    private double price ;
    private Person person ;

    public Car(String name, Double price) {
        this.name = name ;
        this.price = price ;
    }

    public void setPerson(Person person) {
        this.person = person ;
    }
    public Person getPerson() {
        return this.person ;
    }

    public String getInfo() {
        return this.name + ":" + this.price ;
    }
}

class Person {
    private String name ;
    private int age ;
    private Car car ;
    private Person children [] ;

    public Person (String name, int age) {
        this.name = name ;
        this.age = age ;
    }

    public void setChildren(Person children []) {
        this.children = children ;
    }
    public Person [] getChildren() {
        return this.children ;
    }

    public void setCar(Car car) {
        this.car = car ;
    }
    public Car getCar() {
        return this.car ;
    }

    public String getInfo() {
        return this.name + ":" + this.age ;
    }
}

public class ClassSelf {
    public static void main(String[] args) {
        Person person = new Person("广志", 35) ;
        Person childA = new Person("小新", 5) ;
        Person childB = new Person("小葵", 1) ;
        childA.setCar(new Car("三轮车", 200.00));
        childB.setCar(new Car("婴儿车", 100.00));

        person.setChildren(new Person [] {childA, childB});
        Car car = new Car("丰田", 100000.00) ;
        person.setCar(car);
        car.setPerson(person);

        System.out.println(person.getInfo());
        System.out.println(person.getCar().getInfo());

        for (Person child: person.getChildren()) {
            System.out.println(child.getInfo());
            System.out.println(child.getCar().getInfo());
        }
    }
}