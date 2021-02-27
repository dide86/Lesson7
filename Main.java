package ru.geekbrains.lessons.robotcathuman;

public class Main {
    public static void main(String[] args) {
        Movable movables[] = {new Human("Дмитрий Иванов", 10, 100),
                new Cat("Васька", 5, 20),
                new Robot("R2D2", 1, 110),
                new Cat("Cёма", 2, 200),};

        Obstacle obstacles[] = {new Treadmill(100), new Wall(1), new Wall(10)};

        for (Movable movable : movables) {
            for (Obstacle obs : obstacles) {
                if (!obs.overcome(movable)) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}