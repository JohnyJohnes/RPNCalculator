package com.company.operations;

import com.company.ExpressionFormatException;
import com.company.Operation;

public class Mod implements Operation{
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "%";
    }

    @Override
    public String getDescription() {
        return "performs mod operation";
    }

    @Override
    public double execute(double... val) throws ExpressionFormatException {
        return val[0]%val[1];
    }
}
