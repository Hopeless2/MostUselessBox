public class Box {
    public static volatile boolean lever;
    private static Box instance = null;

    private Box() {
    }

    public static Box get() {
        if (instance == null) instance = new Box();
        return instance;
    }

    public boolean getLever() {
        return lever;
    }

    public void upLever() {
        if (lever == false) lever = true;
    }

    public void downLever() {
        if (lever == true) lever = false;
    }


}
