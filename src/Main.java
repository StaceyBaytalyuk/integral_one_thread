public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        double a = 0;
        double b = 2;
        int n = 10_000_000;
        IntegralCalculator calculator = new IntegralCalculator(a, b, n);
        System.out.println("Метод лівих прямокутників: " + calculator.leftRectangle());
        System.out.println("Метод правих прямокутників: " + calculator.rightRectangle());
        System.out.println("Метод трапецій: " + calculator.trapezoid());
        System.out.println("Метод Сімпсона: " + calculator.simpson());
    }
}