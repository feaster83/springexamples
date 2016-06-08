package edu.feaster83.springexamples.building;

import edu.feaster83.springexamples.animal.Cat;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@NoArgsConstructor
@Component
public class CatCage extends AbstractCage<Cat> {

    @Override
    Class<Cat> getGenericType() {
        return Cat.class;
    }
}
