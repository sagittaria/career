package ch1;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
        case "+":
            oper = new OperationAdd();
            break;
        case "-":
            oper = new OperationSub();
            break;
        }
        return oper;
    }

    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperation("+");
        // 在客户端程序里决定到底实例化那个operation
        oper.setNumA(1);
        oper.setNumB(2);
        double result = oper.getResult();
        System.out.println("result: " + result);
    }
}
