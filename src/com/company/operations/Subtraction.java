package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

public class Subtraction implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public String getDescription() {
        return "performs substraction operation";
    }

    @Override
    public double execute(double... val) {
        if (val.length != 2)
            throw new ExpressionFormatException("Wrong");
        return val[0] - val[1];    }
}
