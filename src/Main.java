public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        double a = 0;
        double b = 2;
        int n = 10_000_000;
        IntegralCalculator calculator = new IntegralCalculator(a, b, n);
        printCalculationTime(calculator);
    }

    private void printCalculationTime(IntegralCalculator calculator) {
        long start = System.currentTimeMillis();
        System.out.println(calculator.leftRectangle());
        double time = (double)(System.currentTimeMillis()-start)/1000;
        System.out.println("Метод лівих прямокутників: " + time + " секунд\n");

        start = System.currentTimeMillis();
        System.out.println(calculator.rightRectangle());
        time = (double)(System.currentTimeMillis()-start)/1000;
        System.out.println("Метод правих прямокутників: " + time + " секунд\n");

        start = System.currentTimeMillis();
        System.out.println(calculator.trapezoid());
        time = (double)(System.currentTimeMillis()-start)/1000;
        System.out.println("Метод трапецій: " + time + " секунд\n");

        start = System.currentTimeMillis();
        System.out.println(calculator.simpson());
        time = (double)(System.currentTimeMillis()-start)/1000;
        System.out.println("Метод Сімпсона: " + time + " секунд\n");
    }
}