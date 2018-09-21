package chapter_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repository {

    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User("Nirav1", "Pradhan1", new Date(), "9482922958", "nirav.pradhan1@gmail.com"));
        users.add(new User("Nirav2", "Pradhan2", new Date(), "9482922958", "nirav.pradhan2@gmail.com"));
        users.add(new User("Nirav3", "Pradhan3", new Date(), "9482922958", "nirav.pradhan3@gmail.com"));
        users.add(new User("Nirav4", "Pradhan4", new Date(), "9482922958", "nirav.pradhan4@gmail.com"));
        users.add(new User("Nirav5", "Pradhan5", new Date(), "9482922958", "nirav.pradhan5@gmail.com"));
        users.add(new User("Nirav6", "Pradhan6", new Date(), "9482922958", "nirav.pradhan6@gmail.com"));
        users.add(new User("Nirav7", "Pradhan7", new Date(), "9482922958", "nirav.pradhan7@gmail.com"));
        users.add(new User("Nirav8", "Pradhan8", new Date(), "9482922958", "nirav.pradhan8@gmail.com"));
        users.add(new User("Nirav9", "Pradhan9", new Date(), "9482922958", "nirav.pradhan9@gmail.com"));
        users.add(new User("Nirav10", "Pradhan10", new Date(), "9482922958", "nirav.pradhan10@gmail.com"));
        users.add(new User("Nirav11", "Pradhan11", new Date(), "9482922958", "nirav.pradhan11@gmail.com"));
        users.add(new User("Nirav12", "Pradhan12", new Date(), "9482922958", "nirav.pradhan12@gmail.com"));
        users.add(new User("Nirav13", "Pradhan13", new Date(), "9482922958", "nirav.pradhan14@gmail.com"));
        users.add(new User("Nirav14", "Pradhan14", new Date(), "9482922958", "nirav.pradhan14@gmail.com"));
        users.add(new User("Nirav15", "Pradhan15", new Date(), "9482922958", "nirav.pradhan15@gmail.com"));
        users.add(new User("Nirav16", "Pradhan16", new Date(), "9482922958", "nirav.pradhan16@gmail.com"));
        users.add(new User("Nirav17", "Pradhanq7", new Date(), "9482922958", "nirav.pradhan17@gmail.com"));
        users.add(new User("Nirav18", "Pradhan18", new Date(), "9482922958", "nirav.pradhan18@gmail.com"));
        users.add(new User("Nirav19", "Pradhan19", new Date(), "9482922958", "nirav.pradhan19@gmail.com"));
        users.add(new User("Nirav20", "Pradhan20", new Date(), "9482922958", "nirav.pradhan20@gmail.com"));
        users.add(new User("Nirav21", "Pradhan21", new Date(), "9482922958", "nirav.pradhan21@gmail.com"));
        users.add(new User("Nirav22", "Pradhan22", new Date(), "9482922958", "nirav.pradhan22@gmail.com"));
        users.add(new User("Nirav23", "Pradhan23", new Date(), "9482922958", "nirav.pradhan23@gmail.com"));
        users.add(new User("Nirav24", "Pradhan24", new Date(), "9482922958", "nirav.pradhan24@gmail.com"));
        users.add(new User("Nirav25", "Pradhan25", new Date(), "9482922958", "nirav.pradhan25@gmail.com"));
        users.add(new User("Nirav26", "Pradhan26", new Date(), "9482922958", "nirav.pradhan26@gmail.com"));
        users.add(new User("Nirav27", "Pradhan27", new Date(), "9482922958", "nirav.pradhan27@gmail.com"));
        users.add(new User("Nirav28", "Pradhan28", new Date(), "9482922958", "nirav.pradhan28@gmail.com"));
        users.add(new User("Nirav29", "Pradhan29", new Date(), "9482922958", "nirav.pradhan29@gmail.com"));
        users.add(new User("Nirav30", "Pradhan30", new Date(), "9482922958", "nirav.pradhan30@gmail.com"));
        users.add(new User("Nirav31", "Pradhan31", new Date(), "9482922958", "nirav.pradhan31@gmail.com"));
        users.add(new User("Nirav32", "Pradhan32", new Date(), "9482922958", "nirav.pradhan32@gmail.com"));
    }

    public static int count() {
        return users.size();
    }

    public static List<User> getSubList(int startIndex, int endIndex) {
        return new ArrayList<>(users.subList(startIndex, endIndex));
    }

}
