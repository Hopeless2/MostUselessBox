public class Box {
    public volatile boolean lever;

    public Box() {
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
