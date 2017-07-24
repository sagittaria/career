package ch2;

public class CashMainV2 {
    public static void main(String[] args) {
        CashContextV2 ccv2 = new CashContextV2("正常收费");
        double totalPrice = ccv2.getResult(50);
        System.out.println("total Price: " + totalPrice);
    }
}