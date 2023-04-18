
public class Piece {
    private String title;
    private String composer;
    private String book;
    private int barcode;
    private int count = 0;

    public Piece(String title, String composer, String book) {
        barcode = count;
        count += 1;
        this.title = title;
        this.composer = composer;
        this.book = book;
    }

    public String toString() {
        return 
    }

}