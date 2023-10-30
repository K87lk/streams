package persongenerator;

import java.util.*;

public class PersonGenerator {
    public static Collection<Person> getPersonCollection() {
        List<String> firstName = Arrays.asList(
                "Jack", "Connor", "Harry", "George", "Samuel", "John", "Anna", "Elise", "Mary");
        List<String> secondName = Arrays.asList(
                "Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    firstName.get(new Random().nextInt(firstName.size())),
                    secondName.get(new Random().nextInt(secondName.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        return persons;
    }
}
