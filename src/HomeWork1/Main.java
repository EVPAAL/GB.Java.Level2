package HomeWork1;

import HomeWork1.Barriers.Barrier;
import HomeWork1.Barriers.Treadmill;
import HomeWork1.Barriers.Wall;
import HomeWork1.Members.Cat;
import HomeWork1.Members.Human;
import HomeWork1.Members.Member;
import HomeWork1.Members.Robot;

public class Main {
    public static void main(String[] args) {
        Member[] members = {
                new Human(),
                new Cat(),
                new Robot()
        };

        Barrier[] barriers = {
                new Treadmill(2000),
                new Wall(1)
        };

        for (Member c: members) {
            for (Barrier o : barriers) {
                if(!o.action(c)){
                    break;
                }
            }
        }
    }
}
