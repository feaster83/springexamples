package edu.feaster83.springexamples.building;

import edu.feaster83.springexamples.animal.Dog;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component
public class DogCage extends AbstractCage<Dog> {

    @Override
    Class<Dog> getGenericType() {
        return Dog.class;
    }
}
