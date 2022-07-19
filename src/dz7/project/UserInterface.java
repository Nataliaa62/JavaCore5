package dz7.project;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private final Controller controller = new Controller();


    //считывает город введенный пользователем в city. Бесконечный цикл пока не введем выход
    public void runApplication() throws SQLException {
        Scanner scanner = new Scanner(System.in);
      while (true) {
            System.out.println("Введите название города на английском языке");
            String city = scanner.nextLine();

            setGlobalCity(city);

            System.out.println("Введите ответ: 1 - Получить текущую погоду, " +
                "2 - Получить погоду на следующие 5 дней, " + "3 - Получить данные о погоде из БД, "+
                "выход (exit) - завершить работу");
            String result = scanner.nextLine();

            checkIsExit(result);

           try {
                validateUserInput(result);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            try {
                notifyController(result);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void checkIsExit(String result) {
        if (result.toLowerCase().equals("выход") || result.toLowerCase().equals("exit")) {
            System.out.println("Завершаю работу");
           System.exit(0);
        }
    }

    private void setGlobalCity(String city) {
        ApplicationGlobalState.getInstance().setSelectedCity(city);
    }

    //проверяет являются ли введенные данные валидными (1 или 2)
    private void validateUserInput(String userInput) throws IOException {
        if (userInput == null || userInput.length() != 1) {
            throw new IOException("Incorrect user input: expected one digit as answer, but actually get " + userInput);
        }
        int answer = 0;
        try {
            answer = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IOException("Incorrect user input: character is not numeric!");
        }
    }
    //если ввели корректно, вызывается контроллер
    private void notifyController(String input) throws IOException, SQLException {
        controller.onUserInput(input);
    }

}
