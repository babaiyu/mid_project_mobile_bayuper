package vehicle;

public abstract class Vehicle {
	protected String type;
	protected String brand;
	protected String name;
	protected String licenseNumber;
	protected Integer topSpeed;
	protected Integer gasCap;
	protected Integer wheel;
	protected String typeVehicle;

	public Vehicle(String type, String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap,
			Integer wheel, String typeVehicle) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
		this.typeVehicle = typeVehicle;
	}
}
