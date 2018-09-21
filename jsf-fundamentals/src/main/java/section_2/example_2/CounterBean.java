package section_2.example_2;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class CounterBean implements Serializable {

    private int setCounter;

    private int getCounter;

    private String firstName;

    private String lastName;

    public int getSetCounter() {
        return setCounter;
    }

    public void setSetCounter(int setCounter) {
        this.setCounter = setCounter;
    }

    public int getGetCounter() {
        return getCounter;
    }

    public void setGetCounter(int getCounter) {
        this.getCounter = getCounter;
    }

    public String getFirstName() {
        ++getCounter;
        return firstName;
    }

    public void setFirstName(String firstName) {
        ++setCounter;
        this.firstName = firstName;
    }

    public String getLastName() {
        ++getCounter;
        return lastName;
    }

    public void setLastName(String lastName) {
        ++setCounter;
        this.lastName = lastName;
    }
}
