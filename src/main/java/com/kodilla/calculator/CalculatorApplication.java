package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;
import java.io.*;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
            double oblicz;
            oblicz = calc.add(7,4);
            System.out.println(oblicz);
            System.out.println(calc.subtract(73, 52));
    }
}
