package org.translator.entities;

import java.util.HashMap;

public class PerformedTranslation {
    private HashMap<String, String> result = new HashMap();
    private static PerformedTranslation translate = null;

    PerformedTranslation() {
    }

    public static synchronized PerformedTranslation getInstance() {
        return translate == null ? new PerformedTranslation() : translate;
    }

    public HashMap<String, String> getResult() {
        return this.result;
    }

    public void setResult(HashMap<String, String> result) {
        this.result = result;
    }
}
