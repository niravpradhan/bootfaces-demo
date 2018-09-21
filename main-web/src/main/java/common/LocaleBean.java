package common;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Objects;

@Named
@SessionScoped
public class LocaleBean implements Serializable {

    private String locale = "en";

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void onLocaleChange(ValueChangeEvent event) {
        Object newValue = event.getNewValue();
        if (Objects.nonNull(newValue)) {
            locale = (String) newValue;
        }
        FacesContext.getCurrentInstance().renderResponse();
    }
}
