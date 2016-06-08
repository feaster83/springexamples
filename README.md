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
edu.feaster83.springexamples.ZooApp  | Starting ZooApp application
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | Add Dog to CatCage is NOT allowed
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | Add multiple items to CatCage
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | - Add Dog is NOT allowed
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | - Add Cat is allowed
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | Add Dog to DogCage is allowed
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | Add multiple items to DogCage
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | - Add Dog is allowed
edu.feaster83.springexamples.building.aspect.ValidateAnimalTypeAspect  | - Add Cat is NOT allowed
```