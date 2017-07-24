package ch2;

public class CashContextV2 {
    private CashSuper cs;

    public CashContextV2(String type) {
        switch (type) {
        case "正常收费":
            cs = new CashNormal();
            break;
        case "打八折":
            cs = new CashRebate("0.8");
            break;
        default:
            cs = new CashNormal();
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
