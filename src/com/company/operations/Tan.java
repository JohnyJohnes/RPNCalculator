package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.tan;

public class Tan implements Operation{
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "tan";
    }

    @Override
    public String getDescription() {
        return "performs a tan operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return tan(val[0]);
    }
}
