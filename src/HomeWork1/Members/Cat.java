package HomeWork1.Members;

public class Cat implements Member {
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat() {
        this(2500, 2);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Кот успешно пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Кот не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJump) {
            System.out.println("Кот успешно перепрыгнул " + distance + " м.");
            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть " + distance + " м.");
            return false;
        }
    }
}
