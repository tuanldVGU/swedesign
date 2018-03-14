package org.translator.entities;

public class TranslateNumber {
    private static TranslateNumber instance = null;

    private TranslateNumber() {
    }

    public static synchronized TranslateNumber getInstance() {
        if (instance == null) {
            instance = new TranslateNumber();
        }

        return instance;
    }

    public PerformedTranslation createPerformedTranslation() {
        PerformedTranslation trans = new PerformedTranslation();
        return trans;
    }
}
