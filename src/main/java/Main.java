public class Main {
    public static void main(String[] args) {
        Thread user = new User();
        Thread cat = new CatInBox();
        user.start();
        cat.start();
        while (true) {
            if (user.isInterrupted()) {
                cat.interrupt();
                break;
            }
        }

    }
}
