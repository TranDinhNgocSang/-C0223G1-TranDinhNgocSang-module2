package FuramaResort.utils;

import java.util.regex.Pattern;

public class Validate {
    public boolean validateIDEmployee(String string) {
        final String ID_REGEX = "^(NV-)\\d{4}$";
        return Pattern.matches(ID_REGEX, string);
    }
    public boolean validateName(String string){
        final String NAME_REGEX = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return Pattern.matches(NAME_REGEX, string);
    }
    public boolean validateCitizenIDNumber(String string){
        final String CITIZENIDNUMBER_REGEX = "^(\\d{9}|\\d{12})$";
        return Pattern.matches(CITIZENIDNUMBER_REGEX, string);
    }
    public boolean validateNumberPhone(String string){
        final String NUMBERPHONE_REGEX = "^0\\d{9}$";
        return Pattern.matches(NUMBERPHONE_REGEX, string);
    }
    public boolean validateDateOfBirth (String string){
        final String DATEOFBIRTH_REGEX = "^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
        return Pattern.matches(DATEOFBIRTH_REGEX,string);
    }
    public boolean validateIdCustomer(String string) {
        final String ID_REGEX = "^(KH-)\\d{4}$";
        return Pattern.matches(ID_REGEX, string);
    }
}
