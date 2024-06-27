public class Starter {
    // Задача 3.2.3

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.sing();

        Cuckoo cuckoo = new Cuckoo();
        cuckoo.sing();

        Parrot parrot1 = new Parrot("Привет, я попугай! Я умею говорить.");
        Parrot parrot2 = new Parrot(); // Попугай без текста
        parrot1.sing(); // Выведет первые N случайных символов текста
        parrot2.sing(); // Попугай молчит
        parrot1.sing(); // Еще один раз выводит первые N случайных символов текста
    }

}