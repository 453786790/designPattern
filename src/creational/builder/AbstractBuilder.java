package creational.builder;

public abstract class AbstractBuilder {

    private House house;

    public House getHouse() {
        return house;
    }

    public void createHouse(String name) {
        System.out.println(name + ",开始动工啦...");
        this.house = new House(name);
    }

    /**
     * sometimes,these two methods are very complex. 
     */
    abstract void buildFoundation();
    abstract void buildWall();
    abstract void buildBeams();
    abstract void buildRoof();
}
