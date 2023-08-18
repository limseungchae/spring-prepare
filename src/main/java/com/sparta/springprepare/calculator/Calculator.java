package com.sparta.springprepare.calculator;

public class Calculator {
    public Double operate(double num1, String op, double num2) {
        switch (op) {
            case "*":
                return num1 * num2;  // num1과 num2를 곱한 결과 반환
            case "/":
                if (num2 != 0) {
                    return num1 / num2;  // num1을 num2로 나눈 결과 반환 (단, num2가 0이 아닐 때)
                } else {
                    return null;  // num2가 0인 경우에는 null 반환
                }
            case "+":
                return num1 + num2;  // num1과 num2를 더한 결과 반환
            case "-":
                return num1 - num2;  // num2를 num1에서 뺀 결과 반환
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");  // 위의 연산자들과 일치하지 않을 경우 예외 발생
        }
    }
}
