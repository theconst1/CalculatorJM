import java.util.Scanner;

public class MainAppCalculator {
    public static void main(String[] args) {

        try {
            System.out.println("Hi. Калькулятор умеет выполнять операции с двумя числами: a + b, a - b, a * b, a / b.");
            System.out.println("Введите выражение: ");

            Scanner in = new Scanner(System.in);

            String str = in.nextLine();
            String[] input = str.split(" ");

            if (Validator.inputElementsNumberCheck(input)) {
                throw new Exception("Ошибка: Неверное количество элементов ввода");
            }

            if (Validator.inputElementsSameTypeCheck(input[0], input[2])) {
                throw new Exception("Ошибка: Введённые числа разного типа");
            }

            boolean inputIsRoman = !Character.isDigit(input[0].charAt(0));
            int a = RomanConverter.romanToArab(input[0]);
            int b = RomanConverter.romanToArab(input[2]);
            String operator = input[1];

            Integer calculationResult = CalculationProcedure.calculate(a, b, operator);
            String outputResult;

            if (inputIsRoman) {
                outputResult = RomanConverter.arabToRoman(calculationResult);
            }
            else {
                outputResult = calculationResult.toString();
            }

            System.out.println("Ответ = " + outputResult);

        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
}

