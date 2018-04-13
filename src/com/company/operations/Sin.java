package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.sin;

public class Sin implements Operation{
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "sin";
    }

    @Override
    public String getDescription() {
        return "performs sin operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return sin(val[0]);
    }
}
