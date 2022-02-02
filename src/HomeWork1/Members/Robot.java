package HomeWork1.Members;

public class Robot implements Member {
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {
        this(5000, 3);
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println("Робот успешно пробежал " + distance + " м.");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + distance + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= maxJump) {
            System.out.println("Робот успешно перепрыгнул " + distance + " м.");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть " + distance + " м.");
            return false;
        }
    }
}
