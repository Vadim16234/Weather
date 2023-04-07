import presenter.Presenter;
import userInterface.ConsoleUI;
import userInterface.DesktopUI;
import userInterface.View;
import weatherApi.Service;
import weatherApi.WeatherService;

public class Main {
    public static void main(String[] args) {
//        View view = new ConsoleUI();
        View view = new DesktopUI();
        Service service = new WeatherService();
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}
