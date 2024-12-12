package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<String> soundAllAnimalsSortByName() {
        animalList.sort(Comparator.comparing(Animal::getName));
        List<String> sounds = new ArrayList<>();
        for (Animal animal : animalList) {
            sounds.add(animal.sound());
        }
        return sounds;
    }
}
