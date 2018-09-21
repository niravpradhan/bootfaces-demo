package jsf_scopes.none_scoped.in_other_beans;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@SessionScoped
public class CountBean implements Serializable {

    @ManagedProperty(value = "#{initBeanForOtherBeans}")
    private InitBeanForOtherBeans initBeanForOtherBeans;

    private static final Logger LOG = Logger.getLogger(CountBean.class.getName());

    private int count;

    public CountBean() {
        LOG.info("CountBean#Initializing counter ...");
        count = 0; // will be override in the init() method
    }

    @PostConstruct
    public void init() {
        LOG.info("CountBean#Initializing counter with @PostConstruct ...");
        count = initBeanForOtherBeans.getInit();
    }

    public void increaseCount() {
        count++;
        initBeanForOtherBeans.setInit(count);
        LOG.log(Level.INFO, "Current value: {0}", count);
    }

    public InitBeanForOtherBeans getInitBeanForOtherBeans() {
        return initBeanForOtherBeans;
    }

    public void setInitBeanForOtherBeans(InitBeanForOtherBeans initBeanForOtherBeans) {
        this.initBeanForOtherBeans = initBeanForOtherBeans;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
