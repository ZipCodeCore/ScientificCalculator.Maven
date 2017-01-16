package squier.john.calculatorProject;

/**
 * Created by johnsquier on 1/13/17.
 */
public class CalculatorController {

    private CalculatorInput calculatorInput;
    private CalculatorDisplay calculatorDisplay;
    private CalculatorModel calculatorModel;
    private CalculatorParser calculatorParser;
    private String[] userInput;

    public CalculatorController() {
        calculatorInput = new CalculatorInput();
        calculatorDisplay = new CalculatorDisplay();
        calculatorModel = new CalculatorModel();
        calculatorParser = new CalculatorParser();
        userInput = new String[3];
        userInput[0] = "";
        userInput[1] = "";
        userInput[2] = "";
    }

    public void runCalculator() {
        // r-e-p loop
        while (!userInput[0].equalsIgnoreCase("exit")) {
            String currentValue;
            String memoryValue;

            currentValue = fillCurrentValue();
            memoryValue = fillMemoryValue();

            updateDisplay(currentValue, memoryValue);

            String userInput[] = getUserInput();

            calculatorModel.updateState(userInput);
        }
    }

    private String fillCurrentValue() {
        if (Double.isNaN(calculatorModel.getCurrentValue())) {
            return "Err";
        } else {
            return Double.toString(calculatorModel.getCurrentValue());
        }
    }

    private String fillMemoryValue() {
        return Double.toString(calculatorModel.getMemoryValue());
    }

    private void updateDisplay(String currentValue, String memoryValue) {
        calculatorDisplay.displayCurrentState(currentValue, memoryValue,
                calculatorModel.getDisplayMode());

        calculatorDisplay.displayAvailableOperations(
                calculatorModel.getDisplayMode(),
                calculatorModel.getTrigMode());

        calculatorDisplay.displayInputPrompt();
    }

    private String[] getUserInput() {
        String temp = calculatorInput.getUserInput();
        return calculatorParser.parseUserInput(temp);
    }
}

