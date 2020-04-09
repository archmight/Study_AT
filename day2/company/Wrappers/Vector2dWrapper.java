package com.company.Wrappers;

import com.company.exceptions.VectorOperationException;
import com.company.exceptions.VectorSizeException;
import com.company.vectors.AbstractVector;
import com.company.vectors.Vector2d;

public class Vector2dWrapper extends AbstractVectorWrapper{
    public Vector2dWrapper(Vector2d abstractVector2d) throws VectorSizeException {
        super(abstractVector2d);
        if(getAbstractVector().getSize() != 2) {
            throw new VectorSizeException("ERROR: Vector2d size");
        }
    }

    @Override
    public AbstractVector vector_mul(AbstractVector vector) throws VectorOperationException {
        throw new VectorOperationException("ERROR: vector 2d has no this operation");
    }
}
