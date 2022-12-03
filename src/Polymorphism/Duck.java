package Polymorphism;

public class Duck {
    private Flyable flyable;
    private Quackable quackable;
    public Duck(Flyable fly, Quackable quack) {
        this.flyable = fly;
        this.quackable = quack;
    }

    public void quack() {
        quackable.quack();
    }
    public void fly() {
        flyable.fly();
    }

    public Flyable getFlyable() {
        return flyable;
    }
    public Quackable getQuackAble() {
        return quackable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
