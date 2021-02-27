package ru.geekbrains.lessons.robotcathuman;

public class Wall implements Obstacle{
    int high;

    public Wall(int high) {
        this.high = high;
    }

    @Override
    public boolean overcome(Movable movable) {
        return movable.jump(high);
    }
}
