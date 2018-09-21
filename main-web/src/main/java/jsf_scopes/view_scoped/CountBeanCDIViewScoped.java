package jsf_scopes.view_scoped;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@ViewScoped
public class CountBeanCDIViewScoped implements Serializable {

    private static final Logger LOG = Logger.getLogger(CountBeanCDIViewScoped.class.getName());

    private int count;

    public CountBeanCDIViewScoped() {
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
        return "/jsf_scopes/view_scoped/countcdi";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanCDI#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "/jsf_scopes/view_scoped/countcdi?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
