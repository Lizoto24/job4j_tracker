package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            if (Objects.equals(users[index].getUsername(), login)) {
                return users[index];
            }
        }
        throw new UserNotFoundException("This user was not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("User name less than 3 letters");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Byblik Lesnoy", false),
                new User("Elizaveta Morozova", true),
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException e) {
            System.out.println("User is not valid");
        }
        catch (UserNotFoundException en) {
            System.out.println("This user was not found");
        }
    }
}


