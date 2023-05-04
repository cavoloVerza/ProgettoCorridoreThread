public class App {
    public static void main(String[] args) throws Exception {

        Corridore c = new Corridore("Giovanni");
        Corridore c1 = new Corridore("Andrea");
        Corridore c2 = new Corridore("Samuele");

        c.start();
        c1.start();
        c2.start();

        c.join();
        c1.join();
        c2.join();

        System.out.println("------------ La gara è finita ------------");

    }
}
