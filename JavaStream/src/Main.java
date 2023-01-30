import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Ali"));
        users.add(new User(2, "Mehmet"));
        users.add(new User(3, "Ahmet"));
        users.add(new User(4, "Barış"));
        users.add(new User(5, "Veli"));
        users.add(new User(6, "Ayşe"));
        users.add(new User(7, "Zeynep"));
        users.add(new User(8, "Fatma"));

//        users.stream().forEach(user -> System.out.println("Id:" + user.id + "  Name:" + user.name));

//        users.stream().forEach(User::helloUser);

//        users.stream().forEach(user -> user.helloUser()); // --> Method Reference

//        System.out.println(users.stream().filter(user -> user.id > 5).count());

//        List<User> filteredUsers = users.stream().filter(user -> user.id > 5).collect(Collectors.toList());
//        filteredUsers.stream().forEach(user -> System.out.println("Id:" + user.id + "  Name:" + user.name));

        List<User> mappedUsers = users.stream().map(user -> new User(user.id + 50, user.name + " MAP"))
                .collect(Collectors.toList());
        mappedUsers.stream().forEach(user -> System.out.println("Id:" + user.id + "  Name:" + user.name));

    }
}