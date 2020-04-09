package com.company.Wrappers;
import com.company.exceptions.VectorOperationException;
import com.company.exceptions.VectorSizeException;
import com.company.vectors.AbstractVector;


public abstract class AbstractVectorWrapper {

    private AbstractVector abstractVector;

    public  AbstractVectorWrapper(AbstractVector abstractVector) {
        this.abstractVector = abstractVector;
    }

    public AbstractVector getAbstractVector() {
        return abstractVector;
    }

    public void setAbstractVector(AbstractVector abstractVector) {
        this.abstractVector = abstractVector;
    }

    public AbstractVector sum(AbstractVector vector){
        return this.abstractVector.sum(vector);
    }
    public AbstractVector sub(AbstractVector vector){
        return this.abstractVector.sub(vector);
    }

    public Double mul(AbstractVector vector){
        return this.abstractVector.mul(vector);
    }

    public abstract AbstractVector vector_mul(AbstractVector vector) throws VectorOperationException, VectorSizeException;

    public String toString(){
        return this.abstractVector.toString();
    }

    public boolean equals(Object o){
        return this.abstractVector.equals(o);
    }

    public int hashCode() {
        return this.hashCode();
    }
}