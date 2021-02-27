package ru.geekbrains.lessons.robotcathuman;

public interface Movable {
    int getMaxJumpDistance();

    String getName();

    int getMaxRunDistance();

     default boolean run(int dist) {
        if (getMaxRunDistance() >= dist) {
            System.out.println(getName() + " пробежал " + dist + " метров, так как способен пробежать " + getMaxRunDistance());
            return true;
        } else {
            System.out.println(getName() + " не смог пробежать" + dist + " метров, так как способен пробежать только " + getMaxRunDistance());
            return false;
        }
    }

    default boolean jump(int high) {
        if (getMaxJumpDistance() >= high) {
            System.out.println(getName() + " перепрыгнул стену высотой " + high + " метров, так как способен перепрыгнуть стену " + getMaxJumpDistance() + " метров");
            return true;
        } else {
            System.out.println(getName() + " не смог перепрыгнуть стену " + high + " метров, так как способен перепрыгнуть только стену " + getMaxJumpDistance() + " метров");
            return false;
        }
    }
}
