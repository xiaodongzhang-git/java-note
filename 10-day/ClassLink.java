class Car {
    private String name ;
    private int price ;
    private Person person ;

    public Car(String name, int price) {
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

    public Person (String name, int age) {
        this.name = name ;
        this.age = age ;
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

public class ClassLink {
    public static void main(String[] args) {
        Person person = new Person("小新", 5) ;
        Car car = new Car("三轮车", 200) ;
        person.setCar(car);
        car.setPerson(person);
        System.out.println(person.getInfo());
        System.out.println(person.getCar().getInfo());
    }
}