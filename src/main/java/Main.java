public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "10";
        String b = "25";
        System.out.printf("Результат суммы чисел \"%s\" и \"%s\" составляет: \"%s\"\n", a, b, bins.sum(a, b));
        System.out.printf("Результат произведения чисел \"%s\" и \"%s\" составляет: \"%s\"\n", a, b, bins.mult(a, b));

    }
}
