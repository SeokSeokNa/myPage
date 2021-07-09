package abstractEx;

public class MacBook extends NoteBook{

    public MacBook(String name, float inch, String color) {
        super(name, inch, color);
    }

    @Override
    public void issue() {
        System.out.println("너무 무거워요");
    }

    @Override
    public void pretty_per(double per) {
        System.out.println("맥북은 = " + per + "% 입니다.");
    }
}
