package jsf_scopes.session_scoped;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@SessionScoped
public class CountBeanCDISessionScoped implements Serializable {

    private static final Logger LOG = Logger.getLogger(CountBeanCDISessionScoped.class.getName());

    private int count;

    public CountBeanCDISessionScoped() {
        LOG.info("CountBeanCDI#Initializing counter ...");
        count = 0;
    }

    public void countActionVoid() {                      
        LOG.info("CountBeanCDI#countActionVoid() - Increasing counter ...");
        count++;
    }

    public String countActionAndForward() {
        LOG.info("CountBeanCDI#countActionAndForward() - Increasing counter ...");
        count++;
        return "countcdi";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanCDI#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "countcdi?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
