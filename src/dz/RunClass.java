package dz;

import java.util.Arrays;

public class RunClass {

    public static void main(String[] args) {

        // создаем экз.класса Игроки
        Players player1 = new Players("Максим", 50, 2, true);
        Players player2 = new Players("Елена", 300, 2, true);
        Players player3 = new Players("Семен", 30, 1, true);
        Players player4 = new Players("Артур", 400, 2, false);

        // создаем массив из игроков
        Players [] arrPlayers = {player1, player2, player3, player4};

        // создаем экз.класса Team (наименование команды и массив участников)
        Team team = new Team("Ромашка", arrPlayers);

        // создаем экз.класса Course (массив препятсвий: прыжок, глубина воды, умение делать сальто)
        Course course = new Course(300,2,true);



        team.printMsg();
        System.out.println(Arrays.toString(arrPlayers));
        String result = course.doIt(team);    // записывем в result результат выполнения метода doIt
        System.out.println(result);           //выводим сообщение на экран


    }
}
