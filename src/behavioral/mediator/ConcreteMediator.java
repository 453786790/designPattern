package behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;

    private ConcreteColleagueB colleagueB;

    public ConcreteColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ConcreteColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        if(colleague == colleagueA) {
            colleagueB.doSomething();
        } else if(colleague == colleagueB) {
            colleagueA.doSomething();
        }
    }

    @Override
    public void registerColleagueA(Colleague colleague) {
        this.setColleagueA((ConcreteColleagueA)colleague);
    }

    @Override
    public void registerColleagueB(Colleague colleague) {
        this.setColleagueB((ConcreteColleagueB)colleague);
    }

}
