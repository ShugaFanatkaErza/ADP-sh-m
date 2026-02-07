package module_02.pw;

public class Test {
    public static void main(String[] args) {
        UserManager manager = new UserManager();

        manager.addUser(new User("Shuga", "manatkyzy@mail.com", "Admin"));
        manager.addUser(new User("E", "shugylafanatkaeranyn@mail.com", "User"));

        manager.updateUser("shugylafanatkaeranyn@mail.com", "E T.", "Admin");
        manager.removeUser("manatkyzy@mail.com");
    }
}
