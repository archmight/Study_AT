package com.company.vectors;

import java.util.ArrayList;
import java.util.Arrays;


// Реализовать абстрактный класс AbstractVector и его реализации - Vector2d и Vector3d.
// Реализовать операции сложения и вычитания векторов, векторного и скалярного произведения векторов.
// Классы должны следовать паттерну Immutable.

public abstract class AbstractVector {
    protected Double[] Coords;
    protected Integer size;

    AbstractVector(Integer size){
        this.size = size;
        this.Coords = new Double[size];
        for (int i = 0; i < size; i++) {
            Coords[0] = 0.0;
        }
    }

    AbstractVector(Integer size, Double[] coords){
        this.size = size;
        this.Coords = new Double[size];
        for (int i = 0; i < size; i++) {
            this.Coords[i] = coords[i];
        }
    }

    AbstractVector(Double[] coords){
        if (coords.length == 0) {
            this.size = 0;
            this.Coords = new Double[0];
        }
        else {
            this.size = coords.length;
            this.Coords = coords;
        }
    }

    public Double[] getCoords() {
        return Coords;
    }

    public void setCoords(Double[] coords) {
        Coords = coords;
    }

    public Integer getSize() {
        return size;
    }


    public void setSize(Integer size) {
        this.size = size;
    }

    public abstract AbstractVector sum(AbstractVector vector);
    public abstract AbstractVector sub(AbstractVector vector);
    public abstract Double mul(AbstractVector vector);

    @Override
    public String toString() {
        return "AbstractVector{" +
                "Coords=" + Arrays.toString(Coords) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractVector that = (AbstractVector) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(Coords, that.Coords)) return false;
        return size.equals(that.size);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(Coords);
        result = 31 * result + size.hashCode();
        return result;
    }
}
