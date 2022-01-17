package vehicle;

public class Car extends Vehicle implements IVehicle {
	private Integer entertainmentSystem;

	public Car(String type, String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap,
			Integer wheel, String typeVehicle) {
		super(type, brand, name, licenseNumber, topSpeed, gasCap, wheel, typeVehicle);
	}

	public void setEntertainmentSystem(Integer entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}

	@Override
	public void show() {
		System.out.println("Brand: " + super.brand);
		System.out.println("Name: " + super.name);
		System.out.println("License Plate: " + super.licenseNumber);
		System.out.println("Type: " + super.typeVehicle);
		System.out.println("Gas Capacity: " + super.gasCap);
		System.out.println("Top Speed: " + super.topSpeed);
		System.out.println("Wheel(s): " + super.wheel);
		System.out.println("Entertainment System: " + this.entertainmentSystem);
	}

	@Override
	public String getType() {
		return super.type;
	}

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public void customShowType() {
		System.out.println("Turning on entertainment system...");

		if (super.typeVehicle.equals("Supercar")) {
			System.out.println("Boosting!");
		}
	}

}
