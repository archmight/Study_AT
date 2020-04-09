package com.company.vectors;

import java.util.ArrayList;

public class Vector2d extends AbstractVector{


    Vector2d(Integer size) {
        super(size);
    }

    Vector2d(Integer size, Double[] coords) {
        super(size, coords);
    }

    public Vector2d(Double[] coords) {
        super(coords);
    }
    
    @Override
    public final AbstractVector sum(AbstractVector a) {
        Double[] coords = a.getCoords();
        if(a.getSize().equals(this.getSize())) {
            Double[] result = new Double[this.size];
            for (int i = 0; i < this.size; i++) {
                result[i] = this.Coords[i]+coords[i];
            }
            return new Vector2d(result);
        }
        else {
            System.out.println("NOT EQUAL SIZE !!!!");
            return null;
        }
    }

    @Override
    public final AbstractVector sub(AbstractVector a) {
        if(a.getSize().equals(this.getSize())) {
            Double[] coords = a.getCoords();
            Double[] result = new Double[this.size];
            for (int i = 0; i < this.size; i++) {
                result[i] = this.Coords[i]-coords[i];
            }
            return new Vector2d(result);
        }
        else {
            System.out.println("NOT EQUAL SIZE !!!!");
            return null;
        }
    }

    @Override
    public final Double mul(AbstractVector a) {
        if(a.getSize().equals(this.getSize())) {
            Double[] coords = a.getCoords();
            double result = 0.0;
            for (int i = 0; i < this.size; i++) {
                result += this.Coords[i]*coords[i];
            }
            return result;
        }
        else {
            System.out.println("NOT EQUAL SIZE !!!!");
            return null;
        }
    }

}
