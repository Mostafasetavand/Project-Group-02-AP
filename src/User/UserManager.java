package User; // for manager all user that use this game

import User.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<UserAccount> userList;

    public UserManager() {
        this.userList = new ArrayList<>();
    }

    public void addUser(UserAccount user) {
        userList.add(user);
    }

    public UserAccount getUserByUsername(String username) {
        for (UserAccount user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public List<UserAccount> getAllUsers() {
        return userList;
    }
}
