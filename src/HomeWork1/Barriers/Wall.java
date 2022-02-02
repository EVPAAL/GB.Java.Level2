package HomeWork1.Barriers;

import HomeWork1.Members.Member;

public class Wall implements Barrier{
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public boolean action(Member c) {
        return c.jump(heigth);
    }
}
