package dad.geofx.samir.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.samir.controller.LocationController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {
	
	//controller
	private LocationController locationController = new LocationController();
	
	//model
	private ObjectProperty<MainModel> m = new SimpleObjectProperty<>();
	
	//view

    @FXML
    private BorderPane view;

    @FXML
    private Tab locationTab;

    @FXML
    private Tab connectionTab;

    @FXML
    private Tab securityTab;

    @FXML
    private TextField ipTx;

    @FXML
    private Button checkIp;
    
	public MainController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {

		locationTab.setContent(locationController.getView());

		m.addListener((o, ov, nv) -> onMChanged(o, ov, nv));
		
		
	}
	
	private void onMChanged(ObservableValue<? extends MainModel> o, MainModel ov, MainModel nv) {
		if (ov != null) {
			locationController.locationProperty().unbind();
		}
		
		if (nv != null) {
			locationController.locationProperty().bind(nv.locationProperty());
		}
	}

	public BorderPane getView() {
		return view;
	}
	
}
