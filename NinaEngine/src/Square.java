import javax.swing.text.Position;

public class Square {

    private Disc currentDisc;

    public Square() {
        currentDisc = null;
    }

    public Disc getCurrentDisc() {
        return currentDisc;
    }

    public void setCurrentDisc(Disc currentDisc) {
        this.currentDisc = currentDisc;
    }
}
