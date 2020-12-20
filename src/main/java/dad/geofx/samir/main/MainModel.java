package dad.geofx.samir.main;

import dad.geofx.samir.model.Location;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class MainModel {

	private ObjectProperty<Location> location  = new SimpleObjectProperty<Location>(new Location());

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
