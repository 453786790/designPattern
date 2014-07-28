package behavioral.mediator;

public interface Mediator {

    public void registerColleagueA(Colleague colleagueA);
    public void registerColleagueB(Colleague colleague);
    public void changed(Colleague colleague);
}
