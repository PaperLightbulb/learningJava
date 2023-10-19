package com.learningJava.projects.peopleEnum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class People {
    public enum Person {
        JOHN ("John", 3),
        BOB ("Bob", 2),
        RON ("Ron", 4);
        private final String name;
        private final int height;
        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
        private static final List<Person> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Person randPerson() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
}
