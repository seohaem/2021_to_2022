package calculator;

public class Calculator {
    private ICalculaotr iCalculaotr;

    public Calculator(ICalculaotr iCalculaotr) {
        this.iCalculaotr = iCalculaotr;
    }

    public int sum(int x, int y) {
        return this.iCalculaotr.sum(x, y);
    }

    public int minus(int x, int y) {
        return this.iCalculaotr.minus(x, y);
    }
}
