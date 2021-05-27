import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("nino", 20, Arrays.asList("1", "2")),
                new User("gordo", 10, Arrays.asList("3", "4")),
                new User("miki", 15, Arrays.asList("1", "2")),
                new User("gatoberto", 5, Arrays.asList("3", "4")),
                new User("chibo", 44, Arrays.asList("1", "2"))
        );

        Optional<String> stringOptional =users.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap((Stream<String> stringStream) -> stringStream.filter(phoneNo -> phoneNo.equals("4")))
                .findAny();

        stringOptional.ifPresent(System.out::println);
    }


//        List<String> names = Arrays.asList("nino", "gordo", "miki", "gatoberto", "chibo");

//        List<User> userList = names.stream()
//                .filter(name -> !name.equals("chibo"))
//                .map(User::new)
////                .forEach(System.out::println);
//                .collect(Collectors.toList());

    //mapint
//        int sum = userList.stream()
//                .mapToInt(User::getAge)
//                .sum();
//        System.out.println(sum);

    //flatmap


    static class User {

        private String name;
        private Integer age = 30;
        private List<String> phoneNumbers;

        public User(String name, Integer age, List<String> phoneNumbers) {
            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }


        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

        @Override
        public String toString() {
            return "name: " + name + " age: " + age;
        }
    }
}

