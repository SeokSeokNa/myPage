package abstractEx;

public abstract class NoteBook {
    String name;
    float inch;
    String color;

    public NoteBook(String name, float inch, String color) {
        this.name = name;
        this.inch = inch;
        this.color = color;
    }

    public abstract void issue();
    public abstract void pretty_per(double per);

}
