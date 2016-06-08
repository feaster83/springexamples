package edu.feaster83.springexamples;

import edu.feaster83.springexamples.animal.Cat;
import edu.feaster83.springexamples.animal.Dog;
import edu.feaster83.springexamples.building.AnimalCage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;


@Slf4j
@AllArgsConstructor (access = AccessLevel.PRIVATE, onConstructor = @__(@Autowired))
@Component
public class ZooApp implements Runnable {

    private final @NonNull List<AnimalCage> animalCages;

    @PostConstruct
    public void run() {
        log.info("Starting ZooApp application");

        animalCages.stream().forEach(p -> {
            p.add(new Dog());
            p.addAll(Arrays.asList(new Dog(), new Cat()));
        });
    }

    public static void main(String[] args) {
        log.debug("Initializing SpringContext");

        AbstractApplicationContext applicationContext = initializeSpringContext();

        // application in running state

        applicationContext.close();
    }

    private static AbstractApplicationContext initializeSpringContext() {
        return new AnnotationConfigApplicationContext(ZooAppConfig.class);
    }
}
