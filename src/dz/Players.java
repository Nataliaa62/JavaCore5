package dz;

import java.util.Arrays;

public class Players {

    private String namePlayer;              // поля класса для игроков (имя, макс.прыжки и глубина, умение делать сальто)
    private int maxJump;
    private int maxDepth;
    private boolean flip;


    public Players(String namePlayer, int maxJump, int maxDepth, boolean flip) {  //конструктор
        this.namePlayer = namePlayer;
        this.maxJump = maxJump;
        this.maxDepth = maxDepth;
        this.flip = flip;

    }

    //переопределяем метод toString
    @Override
    public String toString() {
                return namePlayer  + ", умеет прыгать на высоту: " + maxJump +
                "м., нырять на глубину " + maxDepth  + "м. и то, что может делать сальто - " + flip +'\n';
    }


    public String getNamePlayer() {                             //геттеры
        return namePlayer;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public boolean getFlip() {
        return flip;
    }

}
