package pattern;

interface walkableRobot{
    public void walk();
}

class normalwalkableRobot implements walkableRobot{
    @Override
    public void walk() {
        System.out.println("Normal walk");
    }
}

class speacialwalkableRobot implements walkableRobot{
    @Override
    public void walk() {
        System.out.println("Speacial walk");
    }
}

interface flyableRobot{
    public void fly();
}

class normalflyableRobot implements flyableRobot{
    @Override
    public void fly() {
        System.out.println("Normal fly");
    }
}

class speacialflyableRobot implements flyableRobot{
    @Override
    public void fly() {
        System.out.println("Speacial fly");
    }
}

class Robot{
    walkableRobot walkrobot;
    flyableRobot flyrobot;
    Robot(walkableRobot walkrobot, flyableRobot flyrobot){
        this.walkrobot = walkrobot;
        this.flyrobot = flyrobot;
    }

    void projecttion(){
        System.out.println("Projecting robot");
    }

    void walk(){
        walkrobot.walk();
    }

    void fly(){
        flyrobot.fly();
    }

}

class companionRobot extends Robot{
    companionRobot(walkableRobot walkrobot, flyableRobot flyrobot) {
        super(walkrobot, flyrobot);
    }

    @Override
    void projecttion(){
        System.out.println("Projecting Companion robot");
    }

}

public class Strategy {

    public static void main(String[] args) {
        Robot newRobot = new companionRobot(new normalwalkableRobot(), new speacialflyableRobot());
        newRobot.walk();
        newRobot.fly();
        newRobot.projecttion();
    }


}
