package com.thuggeelya.web.dto;

public enum Problem {
    A("Акне и воспаления"), B("Сухость и шелушение"), C("Купероз"),
    D("Мимические морщины"), E("Пигментные пятна"), F("Отечность"),
    G("Чувствительность и реактивность");

    private String val;

    Problem(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
