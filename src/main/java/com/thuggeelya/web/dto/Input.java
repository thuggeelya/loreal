package com.thuggeelya.web.dto;

public class Input {

    private Age age;
    private Problem problem;
    private Decorative usageOfDecorativeCosmetics;
    private Climate climate;
    private SkinCare skinCare;

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public SkinCare getSkinCare() {
        return skinCare;
    }

    public void setSkinCare(SkinCare skinCare) {
        this.skinCare = skinCare;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Decorative getUsageOfDecorativeCosmetics() {
        return usageOfDecorativeCosmetics;
    }

    public void setUsageOfDecorativeCosmetics(Decorative usageOfDecorativeCosmetics) {
        this.usageOfDecorativeCosmetics = usageOfDecorativeCosmetics;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "Input{" +
                "age=" + age +
                ", problem=" + problem +
                ", usageOfDecorativeCosmetics=" + usageOfDecorativeCosmetics +
                ", climate=" + climate +
                ", skinCare=" + skinCare +
                '}';
    }
}
