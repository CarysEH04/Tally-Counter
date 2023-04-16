public class MainApp {
    public static void main(String[] args) {
        TallyCounter counter = new TallyCounter(5);
        System.out.println(counter);
        counter.decrement();
        System.out.println(counter);
        for (int i = 0; i < 50; i++) {
            counter.increment();
        }
        System.out.println(counter);
        counter.decrement();
        System.out.println(counter);

    }
}
