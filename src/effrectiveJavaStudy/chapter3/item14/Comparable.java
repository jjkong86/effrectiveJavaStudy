package effrectiveJavaStudy.chapter3.item14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable {

    public static void main(String... args) {
        List<Person> list = createExamplePersons();
        System.out.printf("before sort: %s%n", list);
        Collections.sort(list, Comparator.comparingInt(Person::getAge).thenComparing(p -> p.name));
        System.out.printf("after sort: %s%n", list);
    }

    private static List<Person> createExamplePersons() {
        return Arrays.asList(
                new Person("John", 33),
                new Person("Sara", 28),
                new Person("MIke", 30)
        );
    }

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
