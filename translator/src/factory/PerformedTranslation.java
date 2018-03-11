package factory;

import java.util.HashMap;

public class PerformedTranslation {
    private HashMap<String, String> map = new HashMap();

    public PerformedTranslation() {
    }

    public void store(HashMap<String, String> m) {
        this.map = m;
    }

    public HashMap<String, String> load() {
        return this.map;
    }
}
