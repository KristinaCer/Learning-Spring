package com.xml_config.setter_injection.concurency_converter_collections;

import java.util.Map;

public class CurrencyConverter {
    private Map<String, String> mObj;

    public Map<String, String> getmObj() {
        return mObj;
    }

    public void setmObj(Map<String, String> mObj) {
        this.mObj = mObj;
    }

    public int getTotalCurrencyValue(String value) {
        return 0;
    }
}