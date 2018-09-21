package jsf_scopes.none_scoped.in_other_beans;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@NoneScoped
public class InitBeanForOtherBeans implements Serializable {

    private static final Logger LOG = Logger.getLogger(InitBeanForOtherBeans.class.getName());

    private int init;

    public InitBeanForOtherBeans() {
        LOG.info("InitBean#Constructor invoked ...");
        init = 5;
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }
}
