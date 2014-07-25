package creational.builder;

public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public AbstractBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void constructHouse(String name){
        builder.createHouse(name);
        builder.buildFoundation();
        builder.buildWall();
        builder.buildBeams();
        builder.buildRoof();
    }
}
