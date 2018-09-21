package chapter_5;

import org.apache.commons.lang3.StringUtils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@FacesConverter("chapter_5.CreditCardConverter")
public class CreditCardConvertor implements Converter<CreditCard> {

    private final Logger LOGGER = Logger.getLogger("chapter_5.CreditCardConverter");

    @Override
    public CreditCard getAsObject(FacesContext context, UIComponent component, String value) {
        LOGGER.log(Level.INFO, "Inside CreditCardConvertor.getAsObject method");
        if(StringUtils.isBlank(value)) {
            throw new ConverterException("Value is required");
        }
        CreditCard card = new CreditCard();
        card.setNumber(value);
        return card;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, CreditCard card) {
        LOGGER.log(Level.INFO, "Inside CreditCardConvertor.getAsString method");
        if (Objects.nonNull(card) && Objects.nonNull(card.getNumber())) {
            StringBuilder sb = new StringBuilder();
            String number = card.getNumber();
            for (int i = 0; i < number.length(); i++) {
                sb.append(number.charAt(i));
                if((i + 1) < 16 && ((i + 1) % 4 == 0)) {
                    sb.append('-');
                }
            }
            sb.toString();
        }
        return null;
    }
}
