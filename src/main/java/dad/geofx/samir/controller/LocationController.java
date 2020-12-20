package dad.geofx.samir.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.samir.model.Location;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable{

	//controller
	private ObjectProperty<Location> location = new SimpleObjectProperty();
	
	//view
	@FXML
    private GridPane view;

    @FXML
    private Label latitudL;

    @FXML
    private Label longitudL;

    @FXML
    private Label ipL;

    @FXML
    private ImageView paisesI;

    @FXML
    private Label ciudadL;

    @FXML
    private Label zipL;

    @FXML
    private Label zonaL;

    @FXML
    private Label currencyL;

    @FXML
    private Label lenguaL;

    @FXML
    private Label codeL;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public GridPane getView() {
		return view;
	}

	public final ObjectProperty<Location> locationProperty() {
		return this.location;
	}
	

	public final Location getLocation() {
		return this.locationProperty().get();
	}
	

	public final void setLocation(final Location location) {
		this.locationProperty().set(location);
	}
	

}
