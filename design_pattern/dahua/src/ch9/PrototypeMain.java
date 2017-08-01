package ch9;

public class PrototypeMain {

    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype("5");
        ConcretePrototype cp_copy = (ConcretePrototype) cp.copy();
        
        System.out.println(cp.getId() == cp_copy.getId());// true
        System.out.println(cp.getId().equals(cp_copy.getId()));// true
        
        cp.setId("9");
        System.out.println(cp_copy.getId());// 还是5
        
        System.out.println("cp.id.hashCode: " + cp.getId().hashCode());// 57
        System.out.println("cp_copy.id.hashCode: " + cp_copy.getId().hashCode());// 53

        String str_a = "abc";
        String str_b = str_a;
        System.out.println("str_a.hashCode: " + str_a.hashCode());// 96354
        System.out.println("str_b.hashCode: " + str_b.hashCode());// 96354
    }

}
