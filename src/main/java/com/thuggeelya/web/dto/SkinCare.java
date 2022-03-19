package com.thuggeelya.web.dto;

public enum SkinCare {
    A("Очищение: пенка для умывания, молочко для умывания, гель для умывания, мицеллярная вода"),
    B("Тонизация: тоник"), C("Активный уход: масла, сыворотки"),
    D("Ежедневный уход: кремы, флюиды, солнцезащитный крем"), E("Активный уход: маски для лица");

    private String val;

    SkinCare(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
