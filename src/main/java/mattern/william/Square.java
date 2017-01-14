package mattern.william;

/**
 * Created by williammattern on 1/13/17.
 */
public class Square extends CalculatorOperation {

    public Double getSquare(Double inputValue){
        this.inputValue = inputValue;
        outputValue = (inputValue * inputValue);
        Display display = new Display();
        display.showOutputValue(outputValue);
        return outputValue;
    }
}
