package jsf_scopes.session_scoped;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@SessionScoped
public class CountBeanJSFSessionScoped implements Serializable {

    private static final Logger LOG = Logger.getLogger(CountBeanCDISessionScoped.class.getName());

    private int count;

    public CountBeanJSFSessionScoped() {
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
        return "countjsf";
    }

    public String countActionAndRedirect() {
        LOG.info("CountBeanJSF#countActionAndRedirect() - Increasing counter ...");
        count++;
        return "countjsf?faces-redirect=true;";
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
