package com.soter.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static java.math.RoundingMode.CEILING;

/**
 * Created by java on 2017.09.14..
 */
public class Operation {


    public Double division(double number1, Double number2 ){
        double a = Math.round(number1/number2*100000000)/100000000;
        return a;
    }

}
