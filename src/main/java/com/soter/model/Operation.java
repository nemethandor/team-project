package com.soter.model;

<<<<<<< HEAD

public class Operation {



    public double squareRoot (double number){
        return Math.sqrt(number);
=======
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
>>>>>>> 4763b89520c0d3f44b1c40f55d32c64d1f2f89d5
    }

}
