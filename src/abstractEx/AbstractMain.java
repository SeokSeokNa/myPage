package abstractEx;

public class AbstractMain {
    public static void main(String[] args) {
        Flex noteBook = new Flex("갤럭시북 플렉스", 15.6f, "Blue");
        noteBook.issue();
        noteBook.pretty_per(50.0);

        System.out.println();
    }
}
