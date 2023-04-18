
public class Piece {
    private String title;
    private String composer;
    private String book;
    private int barcode;

    public Piece(int barcode, String title, String composer, String book) {
        this.barcode = barcode;
        this.title = title;
        this.composer = composer;
        this.book = book;
    }

    public String toString() {
        return "(" + barcode + ") " + title + " - " + composer + "(" + book + ")";

    }

    public static void main(String[] args) {

    }
}