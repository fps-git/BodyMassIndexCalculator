public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //Ведите массу Вашего тела в килограммах
        int weight = 80;
        //Введите Ваш рост в метрах
        double height = 1.8;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: ");
        System.out.printf("%.2f", bmi);
    }
}