package com.thuggeelya.web.dto;

public enum Decorative {
    A("Каждый день"), B("Несколько раз в месяц"), C("Нет");

    private String val;

    Decorative(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
