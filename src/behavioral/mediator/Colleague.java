package behavioral.mediator;

public abstract class Colleague {
    Mediator mediator;

    public abstract void setMediator(Mediator mediator);
    public abstract void doSomething();
}
