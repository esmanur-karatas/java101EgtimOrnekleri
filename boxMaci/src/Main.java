public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 100, 100);
        Fighter f2 = new Fighter("B", 20, 85, 100, 50);

        Match match = new Match(f1, f2, 90, 120);
        match.run();
    }

}
