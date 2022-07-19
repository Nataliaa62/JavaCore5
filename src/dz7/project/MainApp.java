package dz7.project;

import java.io.IOException;
import java.sql.SQLException;

public class MainApp {

    public static void main(String[] args) throws SQLException, IOException {
        DatabaseRepositorySQLiteImpl databaseRepositorySQLite = new DatabaseRepositorySQLiteImpl();
        AccuWeatherProvider accuWeatherProvider = new AccuWeatherProvider();

        databaseRepositorySQLite.getConnection();
     // databaseRepositorySQLite.performDropTable();
        databaseRepositorySQLite.createTableIfNotExists();

        //запускает интерфейс (консоль)
        UserInterface userInterface = new UserInterface();
        //запускает приложение
        userInterface.runApplication();

        accuWeatherProvider.readWeatherDayFromDB(accuWeatherProvider.detectCityKey());
    }
}
