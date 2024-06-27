public class Sparrow extends Bird {

    public Sparrow() {
        this.name = "Воробей";
    }

    @Override
    public void sing() {
        System.out.println(name + " поет: чырык");
    }
}
