package com.company;

import com.company.vectors.Vector2d;
import com.company.vectors.Vector3d;

public class Main {

    public static void main(String[] args) {

        Double []a = {3.45, 5.7};
        Vector2d vector2a = new Vector2d(a);
        Double []b = {1.23, 2.7};
        Vector2d vector2b = new Vector2d(b);
        System.out.println(vector2a.sum(vector2b) + "===" + vector2a.sub(vector2b) + "===" + vector2a.mul(vector2b));
        Double []c = {3.45, 5.7, 1.1};
        Vector3d vector2c = new Vector3d(c);
        Double []d = {1.23, 2.7, 3.0};
        Vector3d vector2d = new Vector3d(d);
        System.out.println(vector2c.sum(vector2d) + "===" + vector2c.sub(vector2d) + "===" + vector2c.mul(vector2d));
        System.out.println(vector2c.vector_mul(vector2d));
    }
}
