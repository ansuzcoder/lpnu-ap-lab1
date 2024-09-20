package lab2;

import java.util.regex.Pattern;

public class Validator {
    public boolean validateOptionChoice(String choice) {
        return choice.equalsIgnoreCase("а") || choice.equalsIgnoreCase("б") || choice.equalsIgnoreCase("в");
    }

    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile("^[\\p{IsCyrillic}]+$", Pattern.UNICODE_CASE);
        return pattern.matcher(name).find();
    }

    public boolean validateRanges(String input1, String input2) {
        return Pattern.matches("\\d+", input1) && Pattern.matches("\\d+", input2);
    }
}