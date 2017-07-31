package ch7;

public class ProxyMain {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("慧");
        Proxy daili = new Proxy(mm);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
