package ch2;

public class CashMain {
    public static void main(String[] args) {
        CashContext cc;
        String strategy = "打八折";
        switch (strategy) {
        case "正常收费":
            cc = new CashContext(new CashNormal());
            break;
        case "打八折":
            cc = new CashContext(new CashRebate("0.8"));
            break;
        default:
            cc = new CashContext(new CashNormal());
        }
        double totalPrice = cc.getResult(50);
        System.out.println("total Price: " + totalPrice);
    }
}
