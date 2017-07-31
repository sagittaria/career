package ch8;

public class FactoryMethodMain {
public static void main(String[] args) {
    //IFactory factory=new UndergraduateFactory();
    IFactory factory=new VolunteerFactory();//要更换对象时，只要改这一处即可
    //缺点是每增加一个产品，就要多写一个工厂
    LeiFeng student=factory.createLeiFeng();
    student.buyRice();
    student.sweep();
    student.wash();
    System.out.println("his identity: "+student.identity);
}
}
