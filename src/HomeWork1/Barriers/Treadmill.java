package HomeWork1.Barriers;

import HomeWork1.Members.Member;

public class Treadmill implements Barrier {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean action(Member c) {
        return c.run(dist);
    }
}

