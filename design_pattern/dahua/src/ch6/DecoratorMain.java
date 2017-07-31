package ch6;

public class DecoratorMain {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator cd = new ConcreteDecorator();
        cd.setComponent(cc);
        cd.Operation();
    }
}
