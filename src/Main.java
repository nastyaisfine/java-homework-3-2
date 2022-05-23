public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80; // масса тела в кг
        double heigt = 1.78; // рост в метрах
        double BMI = service.calculate(weight, heigt);
        System.out.println("Индекс массы тела = " + BMI);
    }
}