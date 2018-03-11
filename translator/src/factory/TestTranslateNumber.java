package factory;

import java.util.HashMap;

public class TestTranslateNumber {
    public static void main(String[] args) {
        boolean Check = true;
        TranslateNumber t = TranslateNumber.getInstance();
        PerformedTranslation pt1 = t.createPerformedTranslation();
        PerformedTranslation pt2 = t.createPerformedTranslation();
        String[] numDE = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn"};
        String[] numEN = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        HashMap<String, String> m1 = new HashMap();

        for(int i = 0; i < 5; ++i) {
            m1.put(numDE[i], numEN[i]);
        }

        pt1.store(m1);
        System.out.println(m1.toString());
        System.out.println(pt1.load().toString());
        if (!m1.toString().equals(pt1.load().toString())) {
            Check = false;
        }

        HashMap<String, String> m2 = new HashMap();

        for(int i = 5; i < 10; ++i) {
            m2.put(numDE[i], numEN[i]);
        }

        pt2.store(m2);
        System.out.println(m2.toString());
        System.out.println(pt2.load().toString());
        if (!m2.toString().equals(pt2.load().toString())) {
            Check = false;
        }

        if (Check) {
            System.out.println("All tests are successful!");
        } else {
            System.out.println("Test is not successful!");
        }

    }
}
