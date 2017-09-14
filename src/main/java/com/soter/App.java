package com.soter;

import com.soter.model.Operation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Operation operation = new Operation();
        System.out.println(operation.squareRoot(16));
    }


}
