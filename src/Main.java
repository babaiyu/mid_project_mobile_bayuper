import java.util.ArrayList;
import java.util.Scanner;

import vehicle.*;

public class Main {
	static ArrayList<IVehicle> list = new ArrayList<IVehicle>();

	// List of Menu
	private static void menu() {
		System.out.println();
		System.out.println("======= PT. MUSANG =======");
		System.out.println("Choose Menu: ");
		System.out.println("[1] List of Vehicles");
		System.out.println("[2] Add Vehicle");
		System.out.println("[3] Close");
		System.out.println("--------------------------");
		System.out.print("Enter menu => ");
	}

	// List of Vehicles
	private static void menu1() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("|------|---------|---------|");
		System.out.println("|No    | Type    | Name    |");
		System.out.println("|------|---------|---------|");

		for (int i = 0; i < list.size(); i++) {
			String type = list.get(i).getType();
			String name = list.get(i).getName();

			String showData = String.format("%d, %s, %s", i + 1, type, name);
			System.out.println(showData);
		}

		System.out.print("Pick a vehicle number to test drive: ");
		Integer selectedNumber = input.nextInt();

		list.get(selectedNumber - 1).show();
		list.get(selectedNumber - 1).customShowType();
		
		input.nextLine();
		System.out.print("ENTER to return");
		input.nextLine();
	}

	// Add Vehicle
	private static void menu2() {
		Scanner inputVehicle = new Scanner(System.in);
		System.out.println();
		System.out.println("======= Add Vehicle =======");

		System.out.print("Input Type [Car | Motorcycle]: ");
		String iType = inputVehicle.nextLine();

		System.out.print("Input Brand [ >=5 ]: ");
		String iBrand = inputVehicle.nextLine();

		System.out.print("Input Name [ >= 5 ]: ");
		String iName = inputVehicle.nextLine();

		System.out.print("Input License: ");
		String iLicenseNumber = inputVehicle.nextLine();

		System.out.print("Input Top Speed [100 <= topSpeed <= 250 ]: ");
		Integer iTopSpeed = inputVehicle.nextInt();

		System.out.print("Input Gas Capacity [ 30 <= gasCap <= 60 ]: ");
		Integer iGasCap = inputVehicle.nextInt();

		System.out.print(iType.equals("Car") ? "Input Wheel [ 4 <= Wheel <= 6 ]: " : "Input Wheel [ 2 <= Wheel <= 3 ]: ");
		Integer iWheel = inputVehicle.nextInt();

		// Fix skipped input
		inputVehicle.nextLine();

		System.out.print(iType.equals("Car") ? "Input Type Vehicle [ SUV | Supercar | Minivan ]: "
				: "Input Type Vehicle [ Automatic | Manual ]: ");
		String iTypeVehicle = inputVehicle.nextLine();

		if (iType.equals("Car")) {
			System.out.print("Input Entertainment System [ >= 1 ]: ");
			Integer iEntertainment = inputVehicle.nextInt();

			Car car = new Car(iType, iBrand, iName, iLicenseNumber, iTopSpeed, iGasCap, iWheel, iTypeVehicle);
			car.setEntertainmentSystem(iEntertainment);

			list.add(car);
		} else if (iType.equals("Motorcycle")) {
			System.out.print("Input Helmet [ >= 1 ]: ");
			Integer iHelmet = inputVehicle.nextInt();

			Motor motor = new Motor(iType, iBrand, iName, iLicenseNumber, iTopSpeed, iGasCap, iWheel, iTypeVehicle);
			motor.setTotalHelmet(iHelmet);

			list.add(motor);
		} else {
			System.out.println("Wrong input Type");
		}
	}

	// Main Method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer menu = null;

		do {
			menu();
			menu = input.nextInt();

			switch (menu) {
			case 1:
				menu1();
				break;

			case 2:
				menu2();
				break;

			case 3:
				System.out.println("Close!");
				System.exit(0);
				break;

			default:
				System.out.println("Oops there is no option for " + menu + "!");
				System.exit(0);
				break;
			}

		} while (menu <= 3 && menu > 0);
		input.close();
	}
}
