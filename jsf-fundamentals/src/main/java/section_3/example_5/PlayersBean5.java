package section_3.example_5;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class PlayersBean5 {

    private final static Logger logger = Logger.getLogger(PlayersBean5.class.getName());
    private String playerName;
    private String playerSurname;

    /**
     * Creates a new instance of PlayersBean
     */
    public PlayersBean5() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public void parametersAction(ActionEvent evt) {     

        playerName = (String) evt.getComponent().getAttributes().get("playerNameAttr");
        playerSurname = (String) evt.getComponent().getAttributes().get("playerSurnameAttr");

        logger.log(Level.INFO, "Name: {0} Surname: {1}", new Object[]{playerName, playerSurname});
    }
}
