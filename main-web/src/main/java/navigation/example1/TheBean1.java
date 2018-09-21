package navigation.example1;

import java.util.Random;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class TheBean1 {

    private static final Logger LOG = Logger.getLogger(TheBean1.class.getName());

    private int rnd = new Random().nextInt(100);

    public int getRnd() {
        return rnd;
    }
}
