public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Thread user = new User(box);
        Thread cat = new CatInBox(box);
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
