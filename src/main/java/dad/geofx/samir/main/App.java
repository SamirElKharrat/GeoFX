package dad.geofx.samir.main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private static Stage primaryStage;

	private MainController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		App.primaryStage = primaryStage;

		controller = new MainController();

		Scene escena = new Scene(controller.getView());

		primaryStage.setScene(escena);
		primaryStage.setTitle("GeoFX");
		primaryStage.show();
		
	}

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
