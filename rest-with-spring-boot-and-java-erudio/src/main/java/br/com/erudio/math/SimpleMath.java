package br.com.erudio.math;

public class SimpleMath {
    public Double sum(
            Double numberOne,
            Double numberTwo
    ) {
        return numberOne + numberTwo;
    }

    public Double sub(
            Double numberOne,
            Double numberTwo
    ) {
        return numberOne - numberTwo;
    }

    public Double multiplication(
            Double numberOne,
            Double numberTwo
    ) {
        return numberOne * numberTwo;
    }

    public Double mean(
            Double numberOne,
            Double numberTwo
    ) {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(
            Double numberOne
    ) {
        return Math.sqrt(numberOne);
    }
}
