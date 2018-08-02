import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Player {

    private char playerSign;
    private ePlayerMode playerMode;
    private String playerID;
    private String playerName;
    private List<Disc> discList;

    public char getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(char playerSign) {
        this.playerSign = playerSign;
    }

    public ePlayerMode getPlayerMode() {
        return playerMode;
    }

    public void setPlayerMode(ePlayerMode playerMode) {
        this.playerMode = playerMode;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player(char playerSign, ePlayerMode playerMode, String playerID, String playerName, List<Disc> discList) {
        this.playerSign = playerSign;
        this.playerMode = playerMode;
        this.playerID = playerID;
        this.playerName = playerName;
        this.discList = new LinkedList<Disc>();
    }

    public List<Disc> getDiscList() {
        return discList;
    }
}


