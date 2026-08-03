package intermediate;

import java.util.List;

public class CalculateAverageAgeOfPerson {
    public static void main(String[] args) {
        List<Person> personsAvgAge = List.of(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 35),
                new Person("David", 40)
        );

        double age = personsAvgAge.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("Average Age: "+ age);
    }
}
class Person{
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}