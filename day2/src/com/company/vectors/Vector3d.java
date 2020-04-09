package com.company.vectors;

import java.util.ArrayList;

public class Vector3d extends Vector2d{

    Vector3d(Integer size) { super(size); }
    Vector3d(Integer size, Double[] coords) {
        super(size, coords);
    }
    public Vector3d(Double[] coords) {
        super(coords);
    }

    public AbstractVector vector_mul(AbstractVector abstractVector) {
        if (abstractVector.getSize().equals(this.getSize())) {
            double i = this.getCoords()[1] * abstractVector.getCoords()[2] - this.getCoords()[2] * abstractVector.getCoords()[1];
            double j = this.getCoords()[2] * abstractVector.getCoords()[0] - this.getCoords()[0] * abstractVector.getCoords()[2];
            double k = this.getCoords()[0] * abstractVector.getCoords()[1] - this.getCoords()[1] * abstractVector.getCoords()[0];
            Double[] a = {i, j, k};
            return new Vector3d(a);
        } else {
            System.out.println("NOT EQUAL SIZE !!!!");
            return null;
        }
    }
}