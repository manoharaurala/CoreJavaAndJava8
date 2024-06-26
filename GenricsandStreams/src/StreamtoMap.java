import java.util.*;
import java.util.stream.Collectors;

public class StreamtoMap {

    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 12)
        );
    }
    public static void main(String[] args) {
        List<Person> people=createPeople();
        Map<String,Person> hm;
        //create a Map with name and age as key, and the person as value.
        hm=people.stream()
                .collect(Collectors.toMap(
                       Person->Person.getName()+ Person.getAge(),
                       Person->Person

                ));

        System.out.println(hm);

    }
}
