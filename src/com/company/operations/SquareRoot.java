package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.sqrt;

public class SquareRoot implements Operation {
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "sqrt";
    }

    @Override
    public String getDescription() {
        return "performs square root operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        if (val.length != 1)
            throw new ExpressionFormatException("Wrong");
        return sqrt(val[0]);
    }
}
