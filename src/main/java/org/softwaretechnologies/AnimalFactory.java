package org.softwaretechnologies;

import org.softwaretechnologies.animals.*;

public class AnimalFactory {

    public static Animal createAnimal(String name, AnimalType type) {
        switch (type) {
            case CAT:
                return new Cat(name);
            case DOG:
                return new Dog(name);
            case COW:
                return new Cow(name);
            default:
                throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
    }
}
