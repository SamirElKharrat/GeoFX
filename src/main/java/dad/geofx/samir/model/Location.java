package dad.geofx.samir.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class Location {
	
	private StringProperty location = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty language = new SimpleStringProperty();
	private StringProperty calling = new SimpleStringProperty();
	private IntegerProperty zip = new SimpleIntegerProperty();
	private DoubleProperty latitude = new SimpleDoubleProperty();
	private DoubleProperty longitude = new SimpleDoubleProperty();
	private StringProperty time = new SimpleStringProperty(); 
	private StringProperty currency = new SimpleStringProperty();
	private ObjectProperty<Image> bandera = new SimpleObjectProperty<Image>();
	
	public final StringProperty locationProperty() {
		return this.location;
	}
	
	public final String getLocation() {
		return this.locationProperty().get();
	}
	
	public final void setLocation(final String location) {
		this.locationProperty().set(location);
	}
	
	public final StringProperty cityProperty() {
		return this.city;
	}
	
	public final String getCity() {
		return this.cityProperty().get();
	}
	
	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	
	public final StringProperty languageProperty() {
		return this.language;
	}
	
	public final String getLanguage() {
		return this.languageProperty().get();
	}
	
	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	
	public final StringProperty callingProperty() {
		return this.calling;
	}
	
	public final String getCalling() {
		return this.callingProperty().get();
	}
	
	public final void setCalling(final String calling) {
		this.callingProperty().set(calling);
	}
	
	public final IntegerProperty zipProperty() {
		return this.zip;
	}
	
	public final int getZip() {
		return this.zipProperty().get();
	}
	
	public final void setZip(final int zip) {
		this.zipProperty().set(zip);
	}
	
	public final DoubleProperty latitudeProperty() {
		return this.latitude;
	}
	
	public final double getLatitude() {
		return this.latitudeProperty().get();
	}
	
	public final void setLatitude(final double latitude) {
		this.latitudeProperty().set(latitude);
	}
	
	public final DoubleProperty longitudeProperty() {
		return this.longitude;
	}
	
	public final double getLongitude() {
		return this.longitudeProperty().get();
	}
	
	public final void setLongitude(final double longitude) {
		this.longitudeProperty().set(longitude);
	}
	
	public final StringProperty timeProperty() {
		return this.time;
	}
	
	public final String getTime() {
		return this.timeProperty().get();
	}
	
	public final void setTime(final String time) {
		this.timeProperty().set(time);
	}
	
	public final StringProperty currencyProperty() {
		return this.currency;
	}
	
	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	
	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	
	public final ObjectProperty<Image> banderaProperty() {
		return this.bandera;
	}
	
	public final Image getBandera() {
		return this.banderaProperty().get();
	}
	
	public final void setBandera(final Image bandera) {
		this.banderaProperty().set(bandera);
	}


}
