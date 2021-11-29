public class CatInBox extends Thread {
    private final Box box;
    final static int TIMING = 2000;

    public CatInBox(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            if (isInterrupted()) return;
            if (box.getLever()) {
                try {
                    Thread.sleep(TIMING);
                    System.out.println("Коробка медленно открывается");
                    Thread.sleep(TIMING);
                    System.out.println("Из коробки вылез котик и потянул рычажок вниз");
                    box.downLever();
                    Thread.sleep(TIMING);
                    System.out.println("Коробка медленно закрывается");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
