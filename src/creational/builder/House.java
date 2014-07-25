package creational.builder;

class Foundation {
    // some definations...
}


class Wall {
    // some definations...
}


class Beam {
    // some definations...
}


class Roof {
    // some definations...
}


public class House {

    private String name;
    private Foundation foundation;
    private Wall wall;
    private Beam beam;
    private Roof roof;

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Beam getBeam() {
        return beam;
    }

    public void setBeam(Beam beam) {
        this.beam = beam;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}
