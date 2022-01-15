import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;

		do {
			menu = menu();

			switch (menu) {
			case 1:
				System.out.println("Lihat Daftar Kendaraan");
				break;
			case 2:
				System.out.println("Tambah Kendaraan");
				break;
			case 3:
				System.out.println("Lihat Detail Kendaraan Kendaraan");
				break;

			default:
				System.out.println("Oops tidak ada opsi untuk " + menu + "!");
				break;
			}
		} while (menu <= 4 && menu > 0);
	}

	private static int menu() {
		System.out.println();
		System.out.println("======= PT. MUSANG =======");
		System.out.println("Pilih Menu Di Bawah ini: ");
		System.out.println("[1] Lihat Daftar Kendaraan");
		System.out.println("[2] Tambah Kendaraan");
		System.out.println("[3] Lihat Detail Kendaraan");
		System.out.println("[4] Keluar");
		System.out.println("--------------------------");
		System.out.print("Masukkan nomor menu => ");
		int chooseMenu = scanner.nextInt();

		return chooseMenu;
	}
}
