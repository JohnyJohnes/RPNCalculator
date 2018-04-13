package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

import static java.lang.Math.exp;

public class Exp implements Operation{
    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "^";
    }

    @Override
    public String getDescription() {
        return "performs exp operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return exp(val[0]);
    }
}
