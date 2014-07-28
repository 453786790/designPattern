package behavioral.mediator;

public class ConcreteColleagueA extends Colleague {

    @Override
    public void doSomething() {
        System.out.println("ColleagueA do something.");
        /**
         * 在colleagueA发生改变时，发信号给mediator，通知mediator去处理，
         * 而不是直接用colleagueB去做处理，这样colleagueA与B就不需要拥有彼此的引用，
         * 而是把耦合的这部分交给mediator，即中介，统一处理
         * 总结：我的行为会直接导致你的改变，而我又不想和你直接打交道(即拥有你的引用)，所以把这个任务交给中介来实现。
         * 我只要做我想做的就行，至于我做之后你会受到什么影响，已经和我无关，我不负责处理你的改变，我只用通知中介说：“hey，我发生改变了！”
         * 中介再根据我的具体行为，处理受我所影响的对象。
         */
        this.mediator.changed(this);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
