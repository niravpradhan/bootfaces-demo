package chapter_8;

import org.omnifaces.util.Faces;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.RequestMap;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;
import java.util.Objects;

@Named
@RequestScoped
public class UserBean {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String onSubmitAction() {
        System.out.printf("%s%n", Faces.getRequestMap());
        String beanName = getClass().getAnnotation(Named.class).getClass().getName();
        System.out.printf("Bean name: %s%n", beanName);
        if (Objects.equals(userName, password)) {
            return "welcome";
        }
        return null;
    }
}
