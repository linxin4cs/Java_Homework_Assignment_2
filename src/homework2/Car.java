package homework2;

public class Car {
	private String id;
	private Make make;
	private Model model;
	private int yearOfManufacture;
	private Color color;
	private double price;
	private int registerationNumber;
	
	public Car(String _id, Make _make, Model _model, int _yearOfManufacture, Color _color, double _price, int _registerationNumber) {
		this.id = _id;
		this.make = _make;
		this.model = _model;
		this.yearOfManufacture = _yearOfManufacture;
		this.color = _color;
		this.price = _price;
		this.registerationNumber  = _registerationNumber;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Make getMake() {
		return this.make;
	}
	
	public Model getModel() {
		return this.model;
	}
	
	public int getYearOfManufacture() {
		return this.yearOfManufacture;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getRegisterNumber() {
		return this.registerationNumber;
	}
	
	public void setId(String _id) {
		this.id = _id;
	}
	
	public void setMake(Make _make) {
		this.make = _make;
	}
	
	public void setModel(Model _model) {
		this.model = _model;
	}
	
	public void setYearOfManufacture(int _yearOfManufacture) {
		this.yearOfManufacture = _yearOfManufacture;
	}
	
	public void setColor(Color _color) {
		this.color = color;
	}
	
	public void setPrice(double _price) {
		this.price = _price;
	}
	
	public void setRegisterationNumber(int _registerationNumber) {
		this.registerationNumber = _registerationNumber;
	}
}

enum Make {
	AUDI,
	BMW,
	BENZ,
	PORSCHE,
	VOLKSWAGEN
}

enum Model {
	SEDAN,
	SUV,
	MPV,
	VAN
}

enum Color {
	RED,
	GREEN,
	WHITE,
	BLACK,
	BLUE,
	GREY
}