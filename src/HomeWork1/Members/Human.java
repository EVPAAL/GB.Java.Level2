package HomeWork1.Members;

public class Human implements Member {
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human() {
        this(1500, 1);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Человек успешно пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Человек не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJump) {
            System.out.println("Человек успешно перепрыгнул " + distance + " м.");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть " + distance + " м.");
            return false;
        }
    }
}
