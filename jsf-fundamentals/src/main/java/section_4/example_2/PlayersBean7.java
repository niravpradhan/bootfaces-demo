package section_4.example_2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class PlayersBean7 {

    private final static Logger logger = Logger.getLogger(PlayersBean7.class.getName());
    private String playerName = "Rafael Nadal";

    /**
     * Creates a new instance of PlayersBean
     */
    public PlayersBean7() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
        logger.log(Level.INFO, "Player name (from setPlayerName() method: {0}", playerName);
    }

    public void action() {
        logger.log(Level.INFO, "Name set: {0}", playerName);
    }

}
