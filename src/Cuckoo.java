import java.util.Random;

public class Cuckoo extends Bird {

    public Cuckoo() {
        this.name = "Кукушка";
    }

    @Override
    public void sing() {
        System.out.print(name + " поет: ");
        Random random = new Random();
        int times = random.nextInt(10) + 1;
        for (int i = 0; i < times; i++) {
            System.out.print("ку-ку ");
        }
        System.out.println();
    }
}