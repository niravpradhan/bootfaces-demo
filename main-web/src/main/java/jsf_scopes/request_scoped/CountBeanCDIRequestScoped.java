package jsf_scopes.request_scoped;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class CountBeanCDIRequestScoped {

    private static final Logger LOG = Logger.getLogger(CountBeanCDIRequestScoped.class.getName());

    private int count;

    public CountBeanCDIRequestScoped() {
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
        return "/jsf_scopes/request_scoped/countcdi";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanCDI#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "/jsf_scopes/request_scoped/countcdi?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
