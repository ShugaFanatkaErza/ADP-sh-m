package module_02.home_work;


//1
class Logger {

    public void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}


//2
class AppConfig {
    public static final String CONNECTION_STRING =
            "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

class DatabaseService {

    public void connect() {
        String cs = AppConfig.CONNECTION_STRING;
        // Логика подключения к базе
    }
}

class LoggingService {

    public void log(String message) {
        String cs = AppConfig.CONNECTION_STRING;
        // Логика записи лога
    }
}

//3
public void processNumbers(int[] numbers) {
    if (numbers == null) return;

    for (int number : numbers) {
        if (number > 0) {
            System.out.println(number);
        }
    }
}


//4
public void printPositiveNumbers(int[] numbers) {
    for (int number : numbers) {
        if (number > 0) {
            System.out.println(number);
        }
    }
}


//5
public int divide(int a, int b) {
    if (b == 0) {
        return 0;
    }
    return a / b;
}

//6
public class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}


//7
public class FileReader {

    public String readFile(String filePath) {
        // Логика чтения файла
        return "file content";
    }
}


//8
public class ReportGenerator {

    public void generateReport() {
        // Генерация отчета
    }
}
