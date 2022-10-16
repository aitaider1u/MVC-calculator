import controller.CalculatriceController;
import model.CalculatriceModel;
import view.CalculatorView;
import view.CalculatriceView;
import view.ListOperationView;

public class Main {
    public static void main(String[] args) {
        CalculatriceModel model = new CalculatriceModel();
        CalculatriceController controller = new CalculatriceController(model);
        CalculatriceView calculatriceView = new CalculatriceView(model,controller);
        ListOperationView listOperationView = new ListOperationView(model);
        CalculatorView calculatorView = new CalculatorView(model);

    }
}

