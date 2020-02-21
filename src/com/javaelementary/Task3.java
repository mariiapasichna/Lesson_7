package com.javaelementary;

import java.util.*;

public class Task3 {

    /*
    3. Есть List объектов у каждого из которых 2 поля: int и String. Удалить те у которых значения int
    повторяются(оставить по одному из дубликатов).
    */

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ben"));
        persons.add(new Person(2, "Alex"));
        persons.add(new Person(1, "Karl"));
        persons.add(new Person(2, "Bob"));
        persons.add(new Person(3, "Bill"));
        persons.add(new Person(4, "Alex"));
        persons.add(new Person(5, "Ben"));
        Set<Person> set = new HashSet<>(persons);
        System.out.println(set);
    }

    private static class Person {
        private int number;
        private String name;

        public Person(int number, String name) {
            this.number = number;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return number == person.number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }

        @Override
        public String toString() {
            return number + ". " + name;
        }
    }
}