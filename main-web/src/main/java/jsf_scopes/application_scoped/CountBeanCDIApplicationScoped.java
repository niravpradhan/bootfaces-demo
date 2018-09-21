package jsf_scopes.application_scoped;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@ApplicationScoped
public class CountBeanCDIApplicationScoped implements Serializable {

    private static final Logger LOG = Logger.getLogger(CountBeanCDIApplicationScoped.class.getName());

    private int count;

    public CountBeanCDIApplicationScoped() {
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
        return "/jsf_scopes/application_scoped/countcdi";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanCDI#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "/jsf_scopes/application_scoped/countcdi?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
