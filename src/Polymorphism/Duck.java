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
<<<<<<< HEAD
    public Quackable getQuackAble() {
=======
    public Quackable getQuackable() {
>>>>>>> 07432dbba251b49dfbc4f514276cfad4a95c3024
        return quackable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
