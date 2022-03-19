package com.thuggeelya.web.dto;

public enum Climate {
    A("Жаркое лето"), B("Холодное лето/весна"),
    C("Осень/тёплая зима в тропическом климате"), D("Холодная зима в умеренном климате");

    private String val;

    Climate(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
