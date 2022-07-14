package dz7.project;

public class MainApp {

    public static void main(String[] args) {
        //запускает интерфейс (консоль)
        UserInterface userInterface = new UserInterface();
        //запускает приложение
        userInterface.runApplication();
    }
}
//Реализовать корректный вывод информации о текущей погоде. Создать класс WeatherResponse и десериализовать ответ сервера.
// Выводить пользователю только текстовое описание погоды и температуру в градусах Цельсия.