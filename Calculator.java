public class Calculator {

    public int result;

    public void plus(int a, int b) {
        this.result = a + b;
    }

    public void minus(int a, int b) {
        this.result = a - b;
    }

    public void divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        this.result = a / b;
    }

    public void multiple(int a, int b) {
        this.result = a * b;
    }

    public void printResult() {
        System.out.println("계산 결과는 " + this.result + " 입니다.");
    }
}
