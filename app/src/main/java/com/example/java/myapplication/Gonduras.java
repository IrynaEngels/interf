package com.example.java.myapplication;

import java.util.Random;

/**
 * Created by java on 28.08.2017.
 */

public class Gonduras implements Country {
    private int population;
    private int gdp;
    private int area;

    public Gonduras(int population, int gdp, int area) {
        this.population = population;
        this.gdp = gdp;
        this.area = area;
    }

    @Override
    public int changePopulation(int population) {
        int rand = (int)Math.random() * 60;
        population = population * rand;
        return population;
    }

    @Override
    public int changeGDP(int gdp) {
        int rand = (int)Math.random() * 30;
        gdp = gdp * rand;
        return gdp;
    }

    @Override
    public int changeArea(int area) {
        int rand = (int)Math.random() * 40;
        area = area * rand;
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public int getGdp() {
        return gdp;
    }

    @Override
    public int getArea() {
        return area;
    }


    public void setPopulation(int population) {
        this.population = population;
    }


    public void setGdp(int gdp) {
        this.gdp = gdp;
    }


    public void setArea(int area) {
        this.area = area;
    }
}
