package creational.builder;

public class ConcreteBuilder extends AbstractBuilder {

    @Override
    void buildFoundation() {
        // 经过复杂的流程建造好了地基
        System.out.println("开始打造地基！！！");
        this.getHouse().setFoundation(new Foundation());
    }

    @Override
    void buildWall() {
        // 砌墙就花了半个多月
        System.out.println("开始砌墙......");
        this.getHouse().setWall(new Wall());
    }

    @Override
    void buildBeams() {
        // 上梁还是很快的，10多个人花了一天的时间
        System.out.println("终于可以上梁了.");
        this.getHouse().setBeam(new Beam());
    }

    @Override
    void buildRoof() {
        // 盖屋顶还是比较轻松的，不过需要高空作业！！注意安全
        System.out.println("盖上屋顶，咱就可以睡觉了！");
        this.getHouse().setRoof(new Roof());
    }

}
