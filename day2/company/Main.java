package com.company;

import com.company.Wrappers.AbstractVectorWrapper;
import com.company.Wrappers.Vector2dWrapper;
import com.company.exceptions.VectorSizeException;
import com.company.vectors.Vector2d;
import com.company.vectors.Vector3d;

public class Main {

    public static void main(String[] args) throws VectorSizeException {

        Double []a = {3.45, 5.7};
        Vector2d v_2a = new Vector2d(a);
        AbstractVectorWrapper vector2a = new Vector2dWrapper(v_2a);

        Double []b = {1.23, 2.7};
        Vector2d v_2b = new Vector2d(b);
        AbstractVectorWrapper vector2b = new Vector2dWrapper(v_2b);

        System.out.println(vector2a.sum(v_2b) + "===" + vector2a.sub(v_2b) + "===" + vector2a.mul(v_2b));


        Double []c = {3.45, 5.7, 1.1};
        Vector3d vector2c = new Vector3d(c);
        Double []d = {1.23, 2.7, 3.0};
        Vector3d vector2d = new Vector3d(d);
        System.out.println(vector2c.sum(vector2d) + "===" + vector2c.sub(vector2d) + "===" + vector2c.mul(vector2d));
        System.out.println(vector2c.vector_mul(vector2d));
    }
}
