import java.sql.*;

import java.sql.Connection;
import java.util.ArrayList;

// I have those exceptions:
// java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
// Exception in thread "main" java.sql.SQLException: No suitable driver found for jdbc:mysql://127.0.0.1:3306/l17

// Первый: проблема с форматом URL-адреса соединения (Connection conn = DriverManager).
// getConnection("jdbc:mysql://localhost:3306/XX","root","XXXX")
// Два: Ошибка строки драйвера (com.mysql.jdbc.Driver)
// Три: соответствующий драйвер mysql_jdbc не добавлен в Classpath (драйвер должен соответствовать вашей версии базы данных)
// Четвёртое: расположение пакета JAR драйвера неверно

public class Main {

    private static Connection connection = null;
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "ubuntu09";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/l17";
    // TODO: I'm not sure how is proper
    // private static final String URL = "jdbc:mysql://localhost:3306/l17";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load class.");
            e.printStackTrace();
        }

        System.out.println("Before DriverManager.getConnection");

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        System.out.println(connection);

        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Vitaliy","Andrushko",13,"Lviv"));
        userList.add(new User("Vitaliy2","Andrushko2",23,"Odessa"));
        userList.add(new User("Vitaliy3","Andrushko3",33,"Odessa"));
        userList.add(new User("Vitaliy4","Andrushko4",43,"Ternopil"));
        userList.add(new User("Vitaliy5","Andrushko5",53,"Ternopil"));
        userList.add(new User("Vitaliy6","Andrushko6",63,"Rivne"));
        userList.add(new User("Vitaliy7","Andrushko7",73,"Rivne"));
        userList.add(new User("Vitaliy8","Andrushko8",83,"Dnipro"));
        userList.add(new User("Vitaliy9","Andrushko9",93,"Dnipro"));
        userList.add(new User("Vitaliy10","Andrushko10",103,"Lviv"));


        // За допомогою джави створити в таблиці 10 різних юзерів, потім витягнути з бази тих хто старше 18;
        // Тих в кого в адресі є місто львів(Hint: use like from sql)

        for (User user: userList) {
            PreparedStatement insertStatement = connection.prepareStatement("Insert into user(firstName, lastName, age, address) value(?, ?, ?, ?);");
            insertStatement.setString(1, user.getFirstName());
            insertStatement.setString(2, user.getLastName());
            insertStatement.setInt(3, user.getAge());
            insertStatement.setString(4, user.getAddress());
            insertStatement.executeUpdate();
        }

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE age > ?");
        statement.setInt(1, 18);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getInt("age"));
        }

        statement = connection.prepareStatement("SELECT * FROM user WHERE address LIKE ?");
        statement.setString(1, "Lviv");
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " + resultSet.getString("address"));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}