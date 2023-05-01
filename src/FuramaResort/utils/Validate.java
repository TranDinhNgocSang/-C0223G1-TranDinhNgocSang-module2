package FuramaResort.utils;

import java.util.regex.Pattern;

public class Validate {
    public boolean validateIDEmployee(String string) {
        final String ID_REGEX = "^(NV-)\\d{4}$";
        return Pattern.matches(ID_REGEX, string);
    }

    public boolean validateName(String string) {
        final String NAME_REGEX = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return Pattern.matches(NAME_REGEX, string);
    }

    public boolean validateCitizenIDNumber(String string) {
        final String CITIZENIDNUMBER_REGEX = "^(\\d{9}|\\d{12})$";
        return Pattern.matches(CITIZENIDNUMBER_REGEX, string);
    }

    public boolean validateNumberPhone(String string) {
        final String NUMBERPHONE_REGEX = "^0\\d{9}$";
        return Pattern.matches(NUMBERPHONE_REGEX, string);
    }

    public boolean validateDateOfBirth(String string) {
        final String DATEOFBIRTH_REGEX = "^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
        return Pattern.matches(DATEOFBIRTH_REGEX, string);
    }

    public boolean validateIdCustomer(String string) {
        final String ID_CUSTOMER_REGEX = "^(KH-)\\d{4}$";
        return Pattern.matches(ID_CUSTOMER_REGEX, string);
    }

    public boolean validateIdServiceVilla(String string) {
        final String ID_SERVICE_VILLA = "^SVVL-\\d{4}$";
        return Pattern.matches(ID_SERVICE_VILLA, string);
    }

    public boolean validateIdServiceHouse(String string) {
        final String ID_SERVICE_HOUSE = "^SVHO-\\d{4}$";
        return Pattern.matches(ID_SERVICE_HOUSE, string);
    }

    public boolean validateIdServiceRoom(String string) {
        final String ID_SERVICE_ROOM = "^SVRO-\\d{4}$";
        return Pattern.matches(ID_SERVICE_ROOM, string);
    }

    public boolean validateNameService(String string) {
        final String NAME_SERVICE = "^[A-Z](\\w|\\s)*$";
        return Pattern.matches(NAME_SERVICE, string);
    }

    public boolean validateArea(String string) {
        final String AREA = "^([3-9]\\d+|[1-9]\\d{2,})$";
        return Pattern.matches(AREA, string);
    }

    public boolean validatePrice(String string) {
        final String PRICE = "^[1-9]\\d*((.)\\d+)$";
        return Pattern.matches(PRICE, string);
    }

    public boolean validateMaximumPeople(String string) {
        final String MAXIMUM_PEOPLE = "^([1-9]|[1]\\d{1})$";
        return Pattern.matches(MAXIMUM_PEOPLE, string);
    }

    public boolean validateNumberOfFloors(String string) {
        final String NUMBER_OF_FLOORS = "^([1-9]\\d*|\\d\\d+)$";
        return Pattern.matches(NUMBER_OF_FLOORS, string);
    }
}
