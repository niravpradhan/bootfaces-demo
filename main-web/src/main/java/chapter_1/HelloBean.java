package chapter_1;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

@Named
@RequestScoped
public class HelloBean {

    private static final Logger LOGGER = Logger.getLogger("chapter_1.HelloBean");

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String onSubmit() {
        LOGGER.log(INFO, "Inside HelloBean.submit() method");
        return null;
    }
}
