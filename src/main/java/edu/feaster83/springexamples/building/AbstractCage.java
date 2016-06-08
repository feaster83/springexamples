package edu.feaster83.springexamples.building;


import edu.feaster83.springexamples.animal.Animal;
import lombok.NonNull;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCage<T> implements AnimalCage {

    @Delegate
    private List<Animal> animals = new ArrayList<>();

    @Override
    public boolean animalAllowed(@NonNull Animal animal) {
        return animal.getClass().isAssignableFrom(getGenericType());
    }

    abstract Class<T> getGenericType();
}
