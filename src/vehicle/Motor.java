package vehicle;

import java.util.Scanner;
import helpers.Helpers;

public class Motor extends Vehicle implements IVehicle {
	private Integer totalHelmet;

	public Motor(String type, String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap,
			Integer wheel, String typeVehicle) {
		super(type, brand, name, licenseNumber, topSpeed, gasCap, wheel, typeVehicle);
	}

	public void setTotalHelmet(Integer totalHelmet) {
		this.totalHelmet = totalHelmet;
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
		System.out.println("Helmet: " + this.totalHelmet);
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
		Scanner scanner = new Scanner(System.in);
		Helpers helpers = new Helpers();

		String standingName = String.format("%s is standing!", super.name);
		System.out.println(standingName);

		System.out.print("Enter price of each helmet (Rp): ");
		Integer helmetPrice = scanner.nextInt();
		String totalHelmetPrice = helpers.toCurrency(helmetPrice * this.totalHelmet);

		System.out.println("Price of all helmet is: " + totalHelmetPrice);
	}

}
