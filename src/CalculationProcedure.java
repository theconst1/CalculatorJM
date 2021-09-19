public class CalculationProcedure {
    public static int calculate(int a, int b, String operator) {

        if (Validator.numbersInRangeCheck(a, b)) {
            throw new RuntimeException("Ошибка: числа выходят за возможный диапазон");
        }

        int result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new RuntimeException("Ошибка : Оператор не корректен, должен быть: + - * /");
        }

        return result;
    }
}