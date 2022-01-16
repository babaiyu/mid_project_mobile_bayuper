package vehicle;

public class Motor extends Vehicle {
	private Integer totalHelmet;

	public Motor(String type, String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap,
			Integer wheel, String typeVehicle) {
		super(type, brand, name, licenseNumber, topSpeed, gasCap, wheel, typeVehicle);
	}
	
	public void showMotor() {
		System.out.println("Type => " + super.type);
		System.out.println("Brand =>" + super.brand);
		System.out.println("Name =>" + super.name);
		System.out.println("License Number =>" + super.licenseNumber);
		System.out.println("Top Speed =>" + super.topSpeed);
		System.out.println("Gas Cap =>" + super.gasCap);
		System.out.println("Wheel =>" + super.wheel);
		System.out.println("Type Vehicle =>" + super.typeVehicle);
		System.out.println("Total Helmet =>" + this.totalHelmet);
	}

	public void setTotalHelmet(Integer totalHelmet) {
		this.totalHelmet = totalHelmet;
	}

}
