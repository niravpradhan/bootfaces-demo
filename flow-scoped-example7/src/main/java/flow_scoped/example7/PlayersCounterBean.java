package flow_scoped.example7;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * 
 * @author Anghel Leonard
 */
@Named
@ApplicationScoped
public class PlayersCounterBean implements Serializable {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void addPlayer() {
        count++;
    }
}
