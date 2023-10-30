package persongenerator;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest {
    public static void main(String[] args) {
        Collection<Person> personCollection = PersonGenerator.getPersonCollection();

        long underage = personCollection
                .stream()
                .filter(person -> person.getAge() < 18)
                .count();
        List<String> readyForArmyService = personCollection
                .stream()
                .filter(person -> person.getAge() > 18 && person.getSex().equals(Sex.MALE))
                .map(Person::getLastname)
                .toList();
        List<String> ableToWork = personCollection
                .stream()
                .filter(person -> person.getSex().equals(Sex.MALE) &&
                        person.getAge() >= 17 && person.getAge() <= 65)
                .filter(person -> person.getSex().equals(Sex.FEMALE) &&
                        person.getAge() >= 17 && person.getAge() <= 60)
                .map(Person::getLastname)
                .toList();

        System.out.println("Number of underage people: " + underage);
        System.out.println("---------------------------------------");
        System.out.println("Ready for army service: " + readyForArmyService);
        System.out.println("---------------------------------------");
        System.out.println("Able to work: " + ableToWork);

    }
}
