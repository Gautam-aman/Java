package pattern.Decorator;


interface Character{
    public String getAbilities();
}

class Mario implements Character{
    @Override
    public String getAbilities() {
        return "Mario";
    }
}

abstract class CharacterDecorator implements Character{
    protected Character character;
    public CharacterDecorator(Character character) {
        this.character = character;
    }
}

class HeightUp extends CharacterDecorator{
    public HeightUp(Character character) {
        super(character);
    }
    @Override
    public String getAbilities() {
        return character.getAbilities() + "with height up";
    }
}

class GunPowerUp extends CharacterDecorator{
    public GunPowerUp(Character character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + "with gun power up";
    }

}

public class Main {
    public static void main(String[] args) {

        Character mario = new Mario();
        mario = new HeightUp(mario);
        mario = new GunPowerUp(mario);
        System.out.println(mario.getAbilities());;

    }
}
