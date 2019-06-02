import java.util.Random;

public class NewNet {

    private Vector input, weightInputHidden, weightHiddenOutput;

    private double output;

    public NewNet(Vector input) {
        this.input = input;
        weightInputHidden = new Vector(input.dimensions()[0]);
        weightHiddenOutput = new Vector(input.dimensions()[0]);

    }

    public void changeInput(Vector input) {
        this.input = input;
    }

    public double forwardPropogation() {
        
    }

}
