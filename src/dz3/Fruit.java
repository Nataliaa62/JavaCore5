package dz3;

public abstract class Fruit {
    //создаем абстрактный класс для фруктов. Каждый фрукт имеет название  и вес.
    private String name;
    private float weightSimple;

    public Fruit(String name, float weightSimple) {
        this.name = name;
        this.weightSimple = weightSimple;
    }

    public  float getWeightSimple() {
        return weightSimple;
    }

    public String getName() {
        return name;
    }

}