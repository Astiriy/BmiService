public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("Ваш индекс массы тела: " + service.calculate(78, 1.97));
    }
}
