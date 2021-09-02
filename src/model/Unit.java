/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khoiiiii@author
 */
public class Unit {
    private String name;
    private double value ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Unit() {
    }

    public Unit(String name, double value) {
        this.name = name;
        this.value = value;
    }
    
    /* data for length unit */
    public List<Unit> getLengthUnits(){
        List<Unit> lengthUnits = new ArrayList<>();
        lengthUnits.add(new Unit("Mile", 1609.34));
        lengthUnits.add(new Unit("Kilometer", 1000));
        lengthUnits.add(new Unit("Hectometer", 100));
        lengthUnits.add(new Unit("Decameter", 10));
        lengthUnits.add(new Unit("Meter", 1));
        lengthUnits.add(new Unit("Decimeter", 0.1));
        lengthUnits.add(new Unit("Centimeter", 0.01));
        lengthUnits.add(new Unit("Millimeter", 0.001));
        return lengthUnits;
    }
    
    /* data for weight unit */
    public List<Unit> getWeightUnits(){
        List<Unit> weightUnits = new ArrayList<>();
        weightUnits.add(new Unit("Tonner", 1000000.0));
        weightUnits.add(new Unit("Kilogram", 1000.0));
        weightUnits.add(new Unit("Gram", 1));
        weightUnits.add(new Unit("Milligram", 0.001));
        weightUnits.add(new Unit("Microgram", 0.000001));
        weightUnits.add(new Unit("Nanogram", 0.000000001));
        return weightUnits;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
