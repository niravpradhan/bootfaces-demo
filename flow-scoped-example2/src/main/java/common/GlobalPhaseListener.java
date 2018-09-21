package common;

import org.omnifaces.util.Beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class GlobalPhaseListener implements PhaseListener {

    private static final Logger LOGGER = Logger.getLogger("common.GlobalPhaseListener");

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        if (event.getPhaseId() == PhaseId.RESTORE_VIEW) {
            UIViewRoot viewRoot = context.getViewRoot();
            if (viewRoot != null) {
                LOGGER.log(INFO, "ViewId: " + viewRoot.getViewId());
            }
        }
        LOGGER.log(INFO, "AFTER PHASE: " + event.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        LOGGER.log(INFO, "BEFORE PHASE: " + event.getPhaseId());
        if (event.getPhaseId() == PhaseId.RENDER_RESPONSE) {
            setLocale();
        }
    }

    private void setLocale() {
        Beans.getActiveInstances(SessionScoped.class).entrySet()
                .stream()
                .filter(e -> Objects.nonNull(e.getValue()))
                .filter(e -> e.getValue().equals("localeBean"))
                .map(e -> e.getKey()).findAny().ifPresent(b -> {
            LocaleBean bean = (LocaleBean) b;
            UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
            viewRoot.setLocale(new Locale(bean.getLocale()));
        });

    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
