package com.thuggeelya.web.dto;

public enum Age {
    A("до 24"), B("25-34"), C("35-44"), D("45+");

    private String val;

    Age(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
