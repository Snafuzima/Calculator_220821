package com.example.calculator_220821.domain;

public class Operations {

    private static float result;

    public static float getResult() {
        return result;
    }

    public void plus(float firstValue, float secondValue) {
        result=firstValue+secondValue;
    }

    public void minus(float firstValue, float secondValue) {
        result=firstValue-secondValue;
    }

    public void multi(float firstValue, float secondValue) {
        result=firstValue*secondValue;
    }

    public void div(float firstValue, float secondValue) {
        result=firstValue/secondValue;
    }



}
