package ch1;

public class OperationAdd extends Operation {
    public double getResult() {
        double result = 0;
        result = getNumA() + getNumB();
        return result;
    }
}
