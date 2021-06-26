package com.SpringCore.Referential;

import java.util.Map;

public class CurrencyConverter {
    private Map<String, String> hMap;

    public Map<String, String> gethMap() {

        return hMap;
    }

    public void sethMap(Map<String, String> hMap) {

        this.hMap = hMap;
    }

    public int getTotalCurrencyValue(String value) {
        for (Map.Entry<String, String> entry : hMap.entrySet()) {
            String currencyName = entry.getKey();
            String uppercaseValue = value.toUpperCase();

            if (uppercaseValue.contains(currencyName)) {
                int conversionRate = Integer.parseInt(entry.getValue());
                int Currency = Integer.parseInt(uppercaseValue.substring(0, uppercaseValue.indexOf(currencyName)));
                return Currency * conversionRate;
            }
        }
        return 0;
    }
}