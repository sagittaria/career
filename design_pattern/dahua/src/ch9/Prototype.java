package ch9;

abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract Prototype copy();

}
