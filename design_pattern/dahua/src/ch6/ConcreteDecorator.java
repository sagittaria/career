package ch6;

public class ConcreteDecorator extends Decorator {
    public void Operation() {
        super.Operation();
        System.out.println("ConcreteDecorator的操作");
    }
}
