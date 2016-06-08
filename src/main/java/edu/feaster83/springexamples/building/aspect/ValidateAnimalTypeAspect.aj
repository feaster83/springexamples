package edu.feaster83.springexamples.building.aspect;

import edu.feaster83.springexamples.animal.Animal;
import edu.feaster83.springexamples.building.AbstractCage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

@Aspect
public aspect ValidateAnimalTypeAspect {
    private static final Logger log = LoggerFactory.getLogger(ValidateAnimalTypeAspect.class);

    @Before("execution(boolean edu.feaster83.springexamples.building.AbstractCage.add*(Animal))")
    public void validateAddMethod(JoinPoint joinPoint) {
        AbstractCage<?> cage = (AbstractCage<?>) joinPoint.getTarget();
        Animal animal = (Animal) joinPoint.getArgs()[0];

        boolean allowed = cage.animalAllowed(animal);
        log.info("Add {} to {} is {}allowed", animal.getClass().getSimpleName(), cage.getClass().getSimpleName(), allowed ? "" : "NOT ");
    }

    @Before("execution(boolean edu.feaster83.springexamples.building.AbstractCage.addAll(Collection))")
    public void validateAddAllMethod(JoinPoint joinPoint) {
        AbstractCage<?> cage = (AbstractCage<?>) joinPoint.getTarget();
        Collection<Animal> animals = (Collection<Animal>) joinPoint.getArgs()[0];

        log.info("Add multiple items to {}", cage.getClass().getSimpleName());
        animals.stream().forEach(animal -> {
            boolean allowed = cage.animalAllowed(animal);
            log.info("- Add {} is {}allowed", animal.getClass().getSimpleName(), allowed ? "" : "NOT ");
        });
    }
}
