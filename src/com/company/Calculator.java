package com.company;

import java.util.List;

public interface Calculator {

    public double execute(List<String> expression);

    public List<String> getOperationsInfo();
}
