package com.example.java.myapplication;

/**
 * Created by java on 28.08.2017.
 */

public class Netherlands implements Country {
    private int population;
    private int gdp;
    private int area;

    public Netherlands(int population, int gdp, int area) {
        this.population = population;
        this.gdp = gdp;
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public int changePopulation(int population) {
        int rand = (int)Math.random() * 30;
        population = population * rand;
        return population;
    }

    @Override
    public int changeGDP(int gdp) {
        int rand = (int)Math.random() * 70;
        gdp = gdp * rand;
        return gdp;
    }

    @Override
    public int changeArea(int area) {
        int rand = (int)Math.random() * 10;
        area = area * rand;
        return area;
    }

}
