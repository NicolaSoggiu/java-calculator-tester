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
    public float addNumber(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public float subtractNumber(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public float divideNumber(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }

    public float multiplyNumber(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
}
