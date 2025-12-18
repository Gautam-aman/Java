package pattern.Builder;

class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) { this.foundation = foundation; }
    public void setStructure(String structure) { this.structure = structure; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setInterior(String interior) { this.interior = interior; }

    @Override
    public String toString() {
        return "House [foundation=" + foundation +
                ", structure=" + structure +
                ", roof=" + roof +
                ", interior=" + interior + "]";
    }
}

interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}

class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and steel");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Load-bearing walls");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete slab");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern style interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}

class HouseDirector {

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House construct() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
        return builder.getHouse();
    }
}




public class BuilderDirectorDemo {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseDirector director = new HouseDirector(builder);

        House house = director.construct();
        System.out.println(house);
    }
}

