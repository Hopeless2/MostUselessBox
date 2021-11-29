public class User extends Thread {
    private final Box box;
    final static int TIMING = 10000;

    public User(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        int counter = 0;
        while (counter <= 3) {
            if (isInterrupted()) return;
            counter++;
            System.out.println("Вы потянули рычажок вверх");
            box.upLever();
            try {
                Thread.sleep(TIMING);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.interrupt();
    }
}
