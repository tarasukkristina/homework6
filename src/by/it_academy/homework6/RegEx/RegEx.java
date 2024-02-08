package by.it_academy.homework6.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String str = "^([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."+
                "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."+
                "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."+
                "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
        String value = "255.225.9.200";
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()){
            System.out.println(value + " is valid");
        } else System.out.println(value + " is invalid");
    }
}
