package module_02.practise_work;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String email) {
        users.removeIf(u -> u.getEmail().equals(email));
    }

    public void updateUser(String email, String newName, String newRole) {
        User user = findByEmail(email);
        if (user != null) {
            user.update(newName, newRole);
        }
    }

    // DRY: қайталанатын іздеуді бөлек әдіске шығардық
    private User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
