package quan_ly_trai_cay.unit;

import java.util.regex.Pattern;

public class Validate {
    public boolean regexId(String id) {
        final String REXGEX_ID = "^TC-[0-9]{4}$";
        if (Pattern.matches(REXGEX_ID, id)) {
            return true;
        }
        return false;
    }

    public boolean regexName(String name) {
        final String REXGEX_NAME = "^([A-Z]{1}[a-z]*\\s*)+$";
        if (Pattern.matches(REXGEX_NAME, name)) {
            return true;
        }
        return false;
    }

    public boolean regexDate(String date) {
        final String REXGEX_DATE = "^\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12]\\d|3[01])$";
        if (Pattern.matches(REXGEX_DATE, date)) {
            return true;
        }
        return false;
    }

    public boolean regexPrice(String price) {
        final String REXGEX_PRICE = "^[1-9]\\d*$";
        if (Pattern.matches(REXGEX_PRICE, price)) {
            return true;
        }
        return false;
    }
}
