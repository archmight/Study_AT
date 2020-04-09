package com.company.Wrappers;

import com.company.exceptions.VectorOperationException;
import com.company.exceptions.VectorSizeException;
import com.company.vectors.AbstractVector;
import com.company.vectors.Vector3d;

public class Vector3dWrapper extends AbstractVectorWrapper{
    public Vector3dWrapper(Vector3d abstractVector) throws VectorSizeException {
        super(abstractVector);
        if(abstractVector.getSize() != 3) {
            throw new VectorSizeException("ERROR: Vector3d size");
        }
    }

    public AbstractVector vector_mul(AbstractVector abstractVector) throws VectorSizeException, VectorOperationException {
        if(abstractVector.getSize() != 3) {
            throw new VectorSizeException("ERROR: Vector3d size");
        }
        else {
            return getAbstractVector().vector_mul(abstractVector);
        }
    }
}
