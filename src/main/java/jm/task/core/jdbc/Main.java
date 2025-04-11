package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Ivan", "Ivanov", (byte) 28);
        service.saveUser("Oleg", "Petrov", (byte) 35);
        service.saveUser("Maxim", "Semenov", (byte) 41);
        service.saveUser("Igor", "Severov", (byte) 20);

        List<User> users = service.getAllUsers();
        users.forEach(System.out::println);

        service.cleanUsersTable();
        service.dropUsersTable();
    }
}

