package jsf_scopes.request_scoped;

import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@RequestScoped
public class CountBeanJSFRequestScoped {

    private static final Logger LOG = Logger.getLogger(CountBeanCDIRequestScoped.class.getName());

    private int count;

    public CountBeanJSFRequestScoped() {
        LOG.info("CountBeanJSF#Initializing counter ...");
        count = 0;
    }

    public void countActionVoid() {                        
        LOG.info("CountBeanJSF#countActionVoid() - Increasing counter ...");
        count++;
    }

    public String countActionAndForward() {                
        LOG.info("CountBeanJSF#countActionAndForward() - Increasing counter ...");
        count++;
        return "/jsf_scopes/request_scoped/countjsf";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanJSF#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "/jsf_scopes/request_scoped/countjsf?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
