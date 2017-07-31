package ch7;

public class Pursuit implements IGiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.name + "，给你dolls");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.name + "，给你flowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.name + "，给你chocolate");
    }

}
