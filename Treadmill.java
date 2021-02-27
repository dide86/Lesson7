package ru.geekbrains.lessons.robotcathuman;

public class Treadmill implements Obstacle{
    int dist;

    public Treadmill (int dist) {
        this.dist = dist;
    }

    @Override
    public boolean overcome(Movable movable){
        return movable.run(dist);
    }
}
