package section_5.example_2;

import javax.el.ELContext;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Anghel Leonard
 */
@Named
@RequestScoped
public class ProfileBean {

    public void viewProfile() {

        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elcontext = context.getELContext();

        //approach 1        
        PlayersBean9 playersBean_1 = (PlayersBean9) context.getApplication().
                evaluateExpressionGet(context, "#{playersBean9}", PlayersBean9.class);

        if (playersBean_1 != null) {
            playersBean_1.playerNameSurnameAction(1);
        } else {
            System.out.println("SESSION BEAN NOT FOUND 1!");
        }        

        //approach 2        
        PlayersBean9 playersBean_2 = (PlayersBean9) context.getApplication().
                getExpressionFactory().createValueExpression(elcontext, "#{playersBean9}",
                        PlayersBean9.class).getValue(elcontext);
        if (playersBean_2 != null) {
            playersBean_2.playerNameSurnameAction(2);
        } else {
            System.out.println("SESSION BEAN NOT FOUND 2!");
        }
        
        //approach 3
        PlayersBean9 playersBean_3 = (PlayersBean9) elcontext.getELResolver().
                getValue(elcontext, null, "playersBean9");
        if (playersBean_3 != null) {
            playersBean_3.playerNameSurnameAction(3);
        } else {
            System.out.println("SESSION BEAN NOT FOUND 3!");
        }
    }
}
