package strategy;

/*
 * 由于里面有abstract的方法，所以是abstract的类
 */
public abstract class Duck {

    // 行为模式中的策略模式
    // 行为可以作为一个类
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    // 所有的子类都有外观，只是外观不一样而已，所以display是abstract的
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // 所有子类共有的，可以使用继承，并且子类可以覆盖
    public void swim() {
        System.out.println(" All ducks float, even decoys!");
    }

    // 动态设定行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    // 动态设定行为
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
