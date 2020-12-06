import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

public class PesanKursiBus {
	public static void main(String[] args) {
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		System.out.println("Selamat Datang di Program Pemesanan Tiket Bus");
		System.out.println("         Dibuat oleh Kelompok 14");
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); 

		//Input nama pemesan
		System.out.print("Masukkan nama pemesan: ");
		String nama = scan.next();
		int choose;
		String indentitas = "", noIdentitas = "";

		do {
			// menginput identitas
			System.out.println("\nPilih identitas yang akan digunakan: ");
			System.out.println("1. KTP");
			System.out.println("2. KK");
			System.out.print("\nMasukkan Pilihan Identitas: ");
			choose = scan.nextInt();
			
			if(choose == 1 || choose == 2) {
				indentitas = choose == 1 ? "KTP" : "KK";
				System.out.print("\nMasukkan Nomor " + indentitas + "(16 digit) : ");
				noIdentitas = scan.next();
				
				while(noIdentitas.length() != 16 && noIdentitas.matches("[0-9]+")) {
					System.out.println("Input Nomor " + indentitas + " harus 16 digit!");
					System.out.print("\nMasukkan Nomor " + indentitas + " (16 digit) : ");
					noIdentitas = scan.next();

				}
				System.out.println("Input Nomor " + indentitas + " berhasil!");
			}else {
			System.out.println("\nHanya ada pilihan 1 dan 2!");
			}
			
		}while(choose < 1 || choose > 2);

		String[] kota = {"Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi"};
		// memilih titik berangkat
		int berangkat, tujuan;
		do {	
		System.out.println("\nPilih Titik Berangkat (hanya JaBoDeTaBek): ");
		cetakKota(kota);
		System.out.print("Masukkan titik Keberangkatan: ");
		berangkat = scan.nextInt();
		if(berangkat < 1 || berangkat > 5)
			System.out.println("\nHanya ada pilihan 1 sampai 5!");
		} while(berangkat < 1 || berangkat > 5);


		// memilih titik tujuan
		do {	
		System.out.println("\nMasukkan Titik Tujuan (hanya JaBoDeTaBek): ");
		cetakKota(kota);
		System.out.print("Masukkan titik Tujuan: ");
		tujuan = scan.nextInt();
		if(tujuan < 1 || tujuan > 5)
			System.out.println("\nHanya ada pilihan 1 sampai 5!");
		} while(tujuan < 1 || tujuan > 5);

		String[] jadwal = {"07:50", "10:45", "13:50", "16:40", "21:45"};

		System.out.println("\nJadwal Bis " + kota[berangkat-1] + "-" + kota[tujuan-1] + ": ");
		for(int i = 0; i < jadwal.length; i++)
			System.out.println((i+1) + ". " + jadwal[i]);
		int injadwal;
		do {
			System.out.print("\nInput Pilihan Jadwal Keberangkatan: ");
		injadwal = scan.nextInt();
		
		if(injadwal >= 1 && injadwal <= 5)
			System.out.println("Input Jadwal Keberangkatan berhasil!");
		else {
			System.out.println("\nHanya ada pilihan 1 sampai 5!");
		}

		} while(injadwal < 1 || injadwal > 5);

		int tickets;
		do {
			System.out.print("\nJumlah tiket yang dipesan: ");
			tickets = scan.nextInt();

			if(tickets < 1)
			System.out.println("Maaf, minimal memesan 1 tiket\n");
			else if(tickets > 10)
			System.out.println("Maaf, maksimal memesan 10 tiket\n");
			else
			System.out.println("Input Jumlah Tiket berhasil!");

		} while(tickets < 1 || tickets > 10);

		//Kurang pilih kursi
		//Kurang kursi tersedia/tidak

		String[] kursi = new String[30];
		int[] kursinya = new int[tickets];
		for (int i = 0; i < kursi.length;i++)
			kursi[i] = "O";
			
		
		int kursiTerisi = 1 + rand.nextInt(30);

		for(int i = 0; i < kursiTerisi; i++) {
			kursi[rand.nextInt(30)] = "X"; 
		}


		System.out.println("Kursi Bus");
		System.out.println("Tanda (O) menandakan bahwa kursi tersedia");
		System.out.println("Tanda (X) menandakan bahwa kursi tidak tersedia");

		if(kursiTerisi + tickets <= 30) {

			for (int j = 0; j < tickets; j++) {
				for(int i = 0; i <= 25; i += 5) {
					System.out.println((i+1) + "(" + kursi[i] + ")" + "\t" + (i+2) + "(" + kursi[i+1] + ")" +"\t\t" + (i+3) + "(" + kursi[i+2] + ")" +"\t" + (i+4) + "(" + kursi[i+3] + ")" +"\t" + (i+5) + "(" + kursi[i+4] + ")");
				}
				int pilihKursi;
				do{	
				System.out.print("Masukkan kursi untuk tiket " + (j+1) + ": ");
				pilihKursi = scan.nextInt();
					if(pilihKursi >= 1 && pilihKursi <= 30) {
						if(kursi[pilihKursi-1].equals("X")) {
							do {	
								System.out.println("Kursi yang dipilih tidak tersedia. Silahkan pilih kursi yang lain.");
								System.out.print("Masukkan kursi untuk tiket " + (j+1) + ": ");
								pilihKursi = scan.nextInt();
							} while(kursi[pilihKursi-1].equals("X"));
						}
						kursi[pilihKursi-1] = "X";
						System.out.println("Input tiket "+ (j+1) + " berhasil!");
						kursinya[j] = pilihKursi;
					
					} else
						System.out.println("Hanya ada kursi 1 sampai 30!");
				} while(pilihKursi < 1 || pilihKursi > 30);
			}
		} else {
			System.out.println("Kursi Sudah Penuh.");
		}

		System.out.print("\nMetode Pembayaran: ");
		System.out.println("1. Tunai");
		System.out.print("\nMasukkan Metode Pembayaran: ");
		int bayar = scan.nextInt();

		//Print tiket
		System.out.println("=================== STRUK PEMESANAN TIKET BUS ===================");
		System.out.println("\n\nNama Pemesanan: " + nama);
		System.out.println("Titik berangkat: " + kota[berangkat-1]);
		System.out.println("Titik tujuan: " + kota[tujuan-1]);
		System.out.println("Jam Keberangkatan: " + jadwal[injadwal-1]);
		System.out.println("No. " + indentitas + ": " + noIdentitas);
		System.out.println("Jumlah tiket yang dipesan: " + tickets);
		System.out.print("Kursi yang dipesan: ");
		for(int i = 0; i < kursinya.length;i++) {
			if(i != kursinya.length-1)
				System.out.print(kursinya[i] + ", ");
			else
				System.out.print(kursinya[i]);			
		}
		System.out.println("\n=================================================================");

	}

	public static void cetakKota(String[] kota) {
		for(int i = 0;i < kota.length;i++) 
			System.out.println((i+1) + ". " + kota[i]);
	}
}