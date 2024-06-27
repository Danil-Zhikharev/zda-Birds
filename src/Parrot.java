import java.util.Random;

public class Parrot extends Bird{

    private String text;
    private Random random = new Random();

    public Parrot() {
        this.name = "Попугай";
    }

    // Конструктор с указанием текста
    public Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        if (text != null && !text.isEmpty()) {
            int N = random.nextInt(text.length()) + 1; // Генерируем число от 1 до длины текста
            String substring = text.substring(0, Math.min(N, text.length())); // Получаем первые N символов текста или меньше, если N больше длины текста
            System.out.println("Попугай поет: " + substring);
        } else {
            System.out.println("Попугай молчит");
        }
    }

}
