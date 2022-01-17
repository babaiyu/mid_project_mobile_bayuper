package helpers;

import java.text.NumberFormat;
import java.util.Locale;

public class Helpers {
	public String toCurrency(Integer num) {
		Locale locale = new Locale("id", "ID");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);

		String result = fmt.format(num);

		return result;
	}

	public Boolean checkType(String type) {
		if (type.equals("Car"))
			return true;
		else if (type.equals("Motorcycle"))
			return true;

		return false;
	}

	public Boolean checkBrandorName(String brand) {
		if (brand.length() >= 5)
			return true;

		return false;
	}

	public Boolean checkLicenseNumber(String licenseNumber) {
		String[] license = licenseNumber.split(" ");
		Boolean isError1 = false, isError2 = false, isError3 = false;

		if (license.length == 3) {
			// Check first Letter
			if (license[0].matches("([A-Z])"))
				isError1 = false;
			else
				isError1 = true;

			// Check Mid Number
			if (license[1].length() >= 1 && license[1].length() <= 4 && license[1].matches("[0-9]+"))
				isError2 = false;
			else
				isError2 = true;

			// Check Latest Letter
			if (license[2].length() >= 1 && license[2].length() <= 3 && license[2].matches("[A-Z]+"))
				isError3 = false;
			else
				isError3 = true;
		} else {
			System.out.println("WRONG LICENSE NUMBER FORMAT!");
			return false;
		}

		if (isError1)
			System.out.println("FIRST WORD MUST A-Z (CAPITAL)");

		if (isError2)
			System.out.println("SECOND WORD MUST 0-9 NUMBER, AT LEAST 1 - 4 LENGTH");

		if (isError3)
			System.out.println("THIRD WORD MUST A-Z (CAPITAL), AT LEAST 1 - 3 LENGTH");

		if (isError1 || isError2 || isError3)
			return false;

		return true;
	}

	public Boolean checkTopSpeed(Integer topSpeed) {
		if (topSpeed >= 100 && topSpeed <= 250)
			return true;

		return false;
	}

	public Boolean checkGasCapacity(Integer gasCapacity) {
		if (gasCapacity >= 30 && gasCapacity <= 60)
			return true;

		return false;
	}

	public Boolean checkWheel(Integer wheel, String type) {
		if (type.equals("Car")) {
			if (wheel >= 4 && wheel <= 6)
				return true;
		} else if (type.equals("Motorcycle")) {
			if (wheel >= 2 && wheel <= 3)
				return true;
		}
		return false;
	}

	public Boolean checkTypeVehicle(String typeVehicle, String type) {
		if (type.equals("Car")) {
			if (typeVehicle.equals("SUV"))
				return true;
			else if (typeVehicle.equals("Supercar"))
				return true;
			else if (typeVehicle.equals("Minivan"))
				return true;
		} else if (type.equals("Motorcycle")) {
			if (typeVehicle.equals("Automatic"))
				return true;
			else if (typeVehicle.equals("Manual"))
				return true;
		}

		return false;
	}

	public Boolean checkEntertainmentSystem(Integer entertainmentSystem) {
		if (entertainmentSystem >= 1)
			return true;

		return false;
	}

	public Boolean checkHelmet(Integer helmet) {
		if (helmet >= 1)
			return true;

		return false;
	}
}
