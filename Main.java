public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.plus(15, 30);
        cal.printResult();

        cal.minus(15, 3);
        cal.printResult();

        cal.divide(30, 15);
        cal.printResult();

        cal.multiple(15, 30);
        cal.printResult();
    }
}
