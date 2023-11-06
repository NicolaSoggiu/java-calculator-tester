package org.experis.course;

public class Calculator {

    // ATTRIBUTI
    private Float firstNumber;
    private Float secondNumber;

    // GETTER E SETTER
    public Float getFirstNumber() {
        return firstNumber;
    }

    public Float getSecondNumber() {
        return secondNumber;
    }

    // METODI
    public static float addNumber(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public static float subtractNumber(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public static float divideNumber(float firstNumber, float secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("The dividend cannot be 0!");
        }
        return firstNumber / secondNumber;
    }

    public static float multiplyNumber(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}
