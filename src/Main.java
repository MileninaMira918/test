// Базовый абстрактный класс Robot
abstract class Robot {
    private String model;

    public Robot(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void sayHello();
}
public class Main {
    public static void main(String[] args) {
        // Создаем двух роботов разных моделей
        Robot t800 = new T800("T800");
        Robot t1000 = new T1000("T1000");

        // Вызываем метод sayHello у обоих роботов
        t800.sayHello();
        t1000.sayHello();
    }
}




