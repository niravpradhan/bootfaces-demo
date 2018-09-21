package section_4.example_3;

import common.CookieUtils;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;

import static common.CookieUtils.createCookie;
import static common.CookieUtils.setCookieInstance;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class CookieBean {

    public void addCookies() {
        // Creating a session cookie for current domain
        Cookie session_cookie = createCookie("player", "Rafael Nadal", -1, 
                null, "/", false, null, 0, true);

        // Creating a persistent cookie (60 seconds) for a sub-domain
        Cookie persistence_cookie = createCookie("dune", "2000", 60, "localhost", 
                "/", false, "Land of sand", 0, true);

        // Set the cookies
        setCookieInstance(session_cookie);
        setCookieInstance(persistence_cookie);
    }
}
