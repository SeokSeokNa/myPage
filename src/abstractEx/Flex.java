package abstractEx;

public class Flex extends NoteBook {

    public Flex(String name, float inch, String color) {
        super(name, inch, color);
    }

    @Override
    public void issue() {
        System.out.println("팬소음이 너무 큼");
    }

    @Override
    public void pretty_per(double per) {
        System.out.println("이쁨정도 = " + per + "%");
    }
}
