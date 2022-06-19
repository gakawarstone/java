package ChooseLook;

import java.util.HashMap;

public class Player {
    private HashMap<String, String> characteristics = new HashMap<String, String>();

    public void setCharacteristic(String characteristicName, String characteristicSubject) {
        try {
            this.characteristics.containsValue(characteristicName);
            this.characteristics.put(characteristicName, characteristicSubject);
        } catch (Exception e) {
            throw e; // [ ] handle
        }
    }

    public String getCharacteristic(String characteristicName) {
        return this.characteristics.get(characteristicName);
    }
}
