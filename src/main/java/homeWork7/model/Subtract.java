package homeWork7.model;

import homeWork7.MethodModel;

public class Subtract implements MethodModel {

    private double result;

    /**
     * Метод вычитания
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return возвращает истину
     */
    @Override
    public boolean calculate(double firstNumber, double secondNumber) {
        result = firstNumber - secondNumber;
        return true;
    }

    @Override
    public boolean isAplicable(String operation) {
        return "-".equals(operation);
    }

    @Override
    public double getResult() {
        return result;
    }
}
