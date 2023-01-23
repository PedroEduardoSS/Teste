import model.*;
import view.*;
import control.*;
import test.*;

public class App {
    public static void main(String[] args) {
        Menu menuWindow = new Menu();
        AppTest test = new AppTest();
        test.checkBudget();
    }
}
