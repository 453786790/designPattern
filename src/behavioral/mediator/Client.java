package behavioral.mediator;

/**
 * @author reedmi
 * 注释：这个程序会出现死循环，希望你找到出错的原因在哪里，good luck
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        // 给colleague注册mediator
        Colleague colleagueA = new ConcreteColleagueA();
        colleagueA.setMediator(mediator);
        Colleague colleagueB = new ConcreteColleagueB();
        colleagueB.setMediator(mediator);

        // 给mediator注册colleague
        mediator.registerColleagueA(colleagueA);
        mediator.registerColleagueB(colleagueB);

        // 某一个colleague发生改变
        colleagueA.doSomething();
    }
}
