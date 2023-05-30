package ss19_thuat_toan.bai_tap13.unit;

import java.util.regex.Pattern;

public class Validate {
    public boolean validateID (String string){
        final String ID_REGEX = "^MT-\\d{4}$";
        return Pattern.matches(ID_REGEX,string);
    }
    public boolean validateName (String string){
        final String NAME_REGEX = "^MT-\\d{4}$";
        return Pattern.matches(NAME_REGEX,string);
    }

    public boolean validateDate (String string){
        final String DATE_REGEX = "^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
        return Pattern.matches(DATE_REGEX,string);
    }
}
