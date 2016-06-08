# Example project with Spring, Lombok and AspectJ

## About

This project is a test project and for educational purpose.

## Run appplication

To run the application you should use the following command:

```bash
mvn clean process-classes exec:java
```

## Output of the application
```
0    [edu.feaster83.springexamples.ZooApp.main()] INFO  org.springframework.context.annotation.AnnotationConfigApplicationContext  - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@78c339e0: startup date [Wed Jun 08 23:23:15 CEST 2016]; root of context hierarchy
217  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.ZooApp  - Starting ZooApp application
259  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - Add Dog to cage: CatCage is allowed = false
259  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - Add multiple items to cage: CatCage
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - - Add Dog is allowed = false
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - - Add Cat is allowed = true
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - Add Dog to cage: DogCage is allowed = true
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - Add multiple items to cage: DogCage
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - - Add Dog is allowed = true
261  [edu.feaster83.springexamples.ZooApp.main()] INFO  edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  - - Add Cat is allowed = false
276  [edu.feaster83.springexamples.ZooApp.main()] INFO  org.springframework.context.annotation.AnnotationConfigApplicationContext  - Closing org.springframework.context.annotation.AnnotationConf
```