package behavioral.mediator;

public class ConcreteColleagueB extends Colleague {

    @Override
    public void doSomething() {
        System.out.println("ColleagueB do something.");
        this.mediator.changed(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

