package ch9;

public class ConcretePrototype extends Prototype implements Cloneable{

    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype copy() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
