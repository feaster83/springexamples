package edu.feaster83.springexamples.building;

import edu.feaster83.springexamples.animal.Animal;

import java.util.Collection;

public interface AnimalCage extends Collection<Animal> {
    boolean animalAllowed(Animal animal);
}
