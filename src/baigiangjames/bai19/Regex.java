package baigiangjames.bai19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("([A-Z])\\w+");
//        Matcher matcher;
        String[] strings = new String[]{"abc", "EG123", "Demo"};
        for (String s : strings) {
            //gán giá trị của lớp Macher
//            matcher = pattern.matcher(s);
//            System.out.println(matcher.matches());
            //tạo 1 Matcher để dùng phương thức matches()
//            System.out.println(Pattern.compile("([A-Z])\\w+").matcher(s).matches());
            //dùng trực tiếp matches của lớp Pattern
            System.out.println(Pattern.matches("([A-Z])\\w+", s));
        }
    }
}
