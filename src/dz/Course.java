package dz;

public class Course {
    String result;      //создаем переменную, в которую будем записывать результат выполнения задания
    private int jump;   // высота прыжка
    private int depth;   // глубина водоема
    private boolean flip;  //умение делать сальто


    public Course(int jump, int depth, boolean flip) {    //констуктор для создани экз.класса Course (Полоса препятсвий)
        this.jump = jump;
        this.depth = depth;
        this.flip = flip;
    }

    public String doIt(Team team) {
        System.out.println("А теперь результаты соревнований!");
        for (Players players : team.getPlayers()) {
            String namePl = players.getNamePlayer();
            int value1 = players.getMaxJump();           // в переменную value записываем значения  показателей игроков,
            int value2 = players.getMaxDepth();          // для дальнейшего сравнения cо значениями полосы препятствий
            boolean value3 = players.getFlip();
            testJump(value1, namePl);                            //методы сравнения результатов
            testDepth(value2);
            testFlip(value3);
        }
        return result;
    }


    private void testJump(int value1, String namePl) {                               //далее методы сравнивают показатели игроков и препятствий
        if (value1 >= jump)
            result += "Игрок " + namePl + " перепрыгнул";   // и записывают в результат соответсвующее сообщение
        else {
            result += "Игрок " + namePl + " не справился с прыжком";
        }
    }

    private void testDepth(int value2) {
        if (value2 >= depth)
            result += ", нырнул";
        else {
            result += ", не смог нырнуть";
        }

    }

    private void testFlip(boolean value3) {
        if (value3 == true) result += " и сделал сальто " + '\n';
        else {
            result += " и не сделал сальто" + '\n';
        }
    }
}





