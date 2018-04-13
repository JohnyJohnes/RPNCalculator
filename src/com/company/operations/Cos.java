package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.cos;


public class Cos implements Operation{
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "cos";
    }

    @Override
    public String getDescription() {
        return "performs cos operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return cos(val[0]);
    }
}
