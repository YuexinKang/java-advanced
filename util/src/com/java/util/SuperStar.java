package com.java.util;

public class SuperStar {
    private String name;
    private String epithet;
    private Double point;
    private Double  backboard;
    private Double assisting;

    public SuperStar() {
    }

    public SuperStar(String name, String epithet, Double point, Double backboard, Double assisting) {
        this.name = name;
        this.epithet = epithet;
        this.point = point;
        this.backboard = backboard;
        this.assisting = assisting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEpithet() {
        return epithet;
    }

    public void setEpithet(String epithet) {
        this.epithet = epithet;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Double getBackboard() {
        return backboard;
    }

    public void setBackboard(Double backboard) {
        this.backboard = backboard;
    }

    public Double getAssisting() {
        return assisting;
    }

    public void setAssisting(Double assisting) {
        this.assisting = assisting;
    }

    @Override
    public String toString() {
        return "SuperStar{" +
                "name='" + name + '\'' +
                ", epithet='" + epithet + '\'' +
                ", point=" + point +
                ", backboard=" + backboard +
                ", assisting=" + assisting +
                '}';
    }
}
