import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

public class PesanKursiBus{
	public static void main(String[] args) {
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		System.out.println("Selamat Datang di Program Pemesanan Tiket Bus");
		System.out.println("         Dibuat oleh Kelompok 14");
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
		System.out.println("\t\tMeeting Point: ");
		System.out.println("Jakarta --> Plaza Festival");
		System.out.println("Bogor --> Mall BTM Bogor");
		System.out.println("Depok --> UI");
		System.out.println("Tangerang --> Summarecon Mall Serpong");
		System.out.println("Bekasi --> Bekasi Cyber Park");
		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

		String[] kota = {"Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi"};
		int[] hargaTiket = {12000, 14000, 15000, 16000, 17000, 18000};
		System.out.println("Daftar Tujuan & Harga Tiket: ");
		for(int j = 0; j < kota.length-1; j++) {
			System.out.print((j+1) + ". " + kota[0] + " - " + kota[j+1]);
			if(kota[0].equals("Jakarta") && kota[j+1].equals("Bogor")) {
				System.out.print("\t \t Rp." + hargaTiket[5] + "\n");
			} else if(kota[0].equals("Jakarta") && kota[j+1].equals("Depok")) {
				System.out.print("\t \t Rp." + hargaTiket[1] + "\n");
			} else if (kota[0].equals("Jakarta") && kota[j+1].equals("Tangerang")) {
				System.out.print("\t\t Rp." + hargaTiket[2] + "\n");
			} else {
				System.out.print("\t\t Rp." + hargaTiket[0] + "\n");
			}
		}
		for(int j = 0; j < kota.length-1; j++) {
			System.out.print((j+5) + ". " + kota[1] + " - " + (kota[j+1].equals(kota[1]) ? kota[0] : kota[j+1]));
			if(kota[1].equals("Bogor") && kota[j+1].equals("Bekasi")) {
				System.out.print("\t\t Rp." + hargaTiket[1] + "\n");
			} else if(kota[1].equals("Bogor") && kota[j+1].equals("Depok")) {
				System.out.print("\t\t Rp." + hargaTiket[0] + "\n");
			} else if (kota[1].equals("Bogor") && kota[j+1].equals("Tangerang")) {
				System.out.print("\t\t Rp." + hargaTiket[3] + "\n");
			} else {
				System.out.print("\t\t Rp." + hargaTiket[5] + "\n");
			}
		}
		for(int j = 0; j < kota.length-1; j++) {
			System.out.print((j+9) + ". " + kota[2] + " - " + (kota[j+1].equals(kota[2]) ? kota[0] : kota[j+1]));
			if(kota[2].equals("Depok") && kota[j+1].equals("Bekasi")) {
				System.out.print("\t\t Rp." + hargaTiket[1] + "\n");
			} else if(kota[2].equals("Depok") && kota[j+1].equals("Bogor")) {
				System.out.print("\t\t Rp." + hargaTiket[0] + "\n");
			} else if (kota[2].equals("Depok") && kota[j+1].equals("Tangerang")) {
				System.out.print("\t\t Rp." + hargaTiket[4] + "\n");
			} else {
				System.out.print("\t\t Rp." + hargaTiket[1] + "\n");
			}
		}
		for(int j = 0; j < kota.length-1; j++) {
			System.out.print((j+13) + ". " + kota[3] + " - " + (kota[j+1].equals(kota[3]) ? kota[0] : kota[j+1]));
			if(kota[3].equals("Tangerang") && kota[j+1].equals("Bekasi")) {
				System.out.print("\t\t Rp." + hargaTiket[3] + "\n");
			} else if(kota[3].equals("Tangerang") && kota[j+1].equals("Bogor")) {
				System.out.print("\t\t Rp." + hargaTiket[3] + "\n");
			} else if (kota[3].equals("Tangerang") && kota[j+1].equals("Depok")) {
				System.out.print("\t\t Rp." + hargaTiket[4] + "\n");
			} else {
				System.out.print("\t\t Rp." + hargaTiket[2] + "\n");
			}
		}
		for(int j = 0; j < kota.length-1; j++) {
			System.out.print((j+17) + ". " + kota[4] + " - " + (kota[j+1].equals(kota[4]) ? kota[0] : kota[j+1]));
			if(kota[4].equals("Bekasi") && kota[j+1].equals("Bogor")) {
				System.out.print("\t\t Rp." + hargaTiket[1] + "\n");
			} else if(kota[4].equals("Bekasi") && kota[j+1].equals("Tangerang")) {
				System.out.print("\t\t Rp." + hargaTiket[3] + "\n");
			} else if (kota[4].equals("Bekasi") && kota[j+1].equals("Depok")) {
				System.out.print("\t\t Rp." + hargaTiket[1] + "\n");
			} else {
				System.out.print("\t\t Rp." + hargaTiket[0] + "\n");
			}
		}

		System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

		Scanner scan = new Scanner(System.in), scan1 = new Scanner(System.in);
		Random rand = new Random(); 
		int choose = 0, harga = 0, totalBayar = 0, jumlahBayar = 0, kembali = 0, bayar = 0;
		String indentitas = "", noIdentitas = "", nama = "", choose1 = "", tujuan1 = "", berangkat1, estimasi = "", jumlahBayar1 = "", bayar1 = "";
//*
		// Menginput nama pemesan
		do{
		System.out.print("Masukkan nama pemesan: ");
		nama = scan.nextLine();
			if(nama.length() == 0)
				System.out.println("Masukkan nama tidak boleh kosong.");
			else if(!nama.matches("[a-zA-Z\\s]+"))
				System.out.println("Masukkan nama tidak boleh berupa selain huruf!");
			else
				System.out.println("\nInput nama pemesan berhasil.\n");	
				

		}while((!nama.matches("[a-zA-Z\\s]+")));

			System.out.println("Pilih identitas yang akan digunakan: ");
			System.out.println("1. KTP");
			System.out.println("2. KK");
		do{
			// menginput indentitas		
				System.out.print("Masukkan Pilihan Identitas: ");
				choose1 = scan.nextLine();
				if(choose1.length() == 0)
					System.out.println("Masukkan identitas tidak boleh kosong.");
				else if((!choose1.matches("[0-9]+") && choose1.length() > 1) || (!choose1.matches("[0-9]+") && choose1.length() == 1))
					System.out.println("\nMasukkan harus berupa angka saja.");
				else{
					choose = Integer.parseInt(choose1);	
					if(choose == 1 || choose == 2) {
						indentitas = choose == 1 ? "KTP" : "KK";
						System.out.print("Masukkan Nomor " + indentitas + " (16 digit) : ");
						noIdentitas = scan.nextLine();

								while(noIdentitas.length() != 16 || !noIdentitas.matches("[0-9]+") || noIdentitas.length() == 0) {
									if(noIdentitas.length() == 0)
										System.out.println("Masukkan nomer identitas tidak boleh kosong.");
									else if(!noIdentitas.matches("[0-9]+"))
										System.out.println("\nInput Nomor " + indentitas + " tidak boleh berupa selain angka!");
									else
										System.out.println("\nInput Nomor " + indentitas + " harus 16 digit!");
									System.out.print("Masukkan Nomor " + indentitas + " (16 digit) : ");
									noIdentitas = scan.next();
								}	
						System.out.println("\nInput Nomor " + indentitas + " berhasil!\n");
					}else {
					System.out.println("\nHanya ada pilihan 1 dan 2!");
					choose1 = "A";
					}
				}	
		}while(!choose1.matches("[0-9]+"));


		// memilih titik berangkat
		int berangkat = 0, tujuan = 0;
		do{	
			System.out.println("piih Titik Berangkat (hanya JaBoDeTaBek): ");
			cetakKota(kota);
			System.out.print("Masukkan titik keberangkatan: ");
			berangkat1 = scan1.nextLine();
			if(berangkat1.length() == 0)
					System.out.println("Masukkan titik berangkat tidak boleh kosong.");
			else if(!berangkat1.matches("[0-9]+") && berangkat1.length() > 1 || (!berangkat1.matches("[0-9]+") && berangkat1.length() == 1))
					System.out.println("\nMasukkan harus berupa angka saja.");
			else{
				berangkat = Integer.parseInt(berangkat1);	
				if(berangkat < 1 || berangkat > 5){
					System.out.println("\nHanya ada pilihan 1 sampai 5!");
					berangkat1 = "A";
				}else{
					System.out.println("\nInput titik berangkat berhasil.\n");	
				}		
			}			
		}while(!berangkat1.matches("[0-9]+"));


		// memilih titik tujuan
		do{	
			System.out.println("Masukkan Titik Tujuan (hanya JaBoDeTaBek): ");
			cetakKota(kota);
			System.out.print("Masukkan titik Tujuan: ");
			tujuan1 = scan1.nextLine();
			if(tujuan1.length() == 0)
					System.out.println("Masukkan titik tujuan tidak boleh kosong.");
			else if(!tujuan1.matches("[0-9]+") && tujuan1.length() > 1 || (!tujuan1.matches("[0-9]+") && tujuan1.length() == 1))
					System.out.println("\nMasukkan harus berupa angka saja.");
			else{
				tujuan = Integer.parseInt(tujuan1);	
				if(tujuan < 1 || tujuan > 5){
					System.out.println("\nHanya ada pilihan 1 sampai 5!");
					tujuan1 = "A";
				}
				else if(tujuan == berangkat){
					System.out.println("\nTitik berangkat dan titik tujuan tidak boleh sama.");
					tujuan1 = "A";
				}else{
					System.out.println("\nInput titik tujuan berhasil.\n");	
				}		
			}			
		}while(!tujuan1.matches("[0-9]+"));


		

		String[] jadwal = {"07:50", "10:45", "13:50", "16:40", "21:45"};

		System.out.println("Jadwal Bis " + kota[berangkat-1] + "-" + kota[tujuan-1] + ": ");
		for(int i = 0; i < jadwal.length; i++)
			System.out.println((i+1) + ". " + jadwal[i]);
		
		int injadwal = 0;
		String injadwal1 = "";

		do{
			System.out.print("Input Pilihan Jadwal Keberangkatan: ");
			injadwal1 = scan.nextLine();
			if(injadwal1.length() == 0)
					System.out.println("Masukkan jadwal keberangkatan tidak boleh kosong.");
			else if(!injadwal1.matches("[0-9]+") && injadwal1.length() > 1 || (!injadwal1.matches("[0-9]+") && injadwal1.length() == 1))
					System.out.println("\nMasukkan harus berupa angka saja.");
			else{
				injadwal = Integer.parseInt(injadwal1);	
				if(injadwal < 1 || injadwal > 5){
					System.out.println("\nHanya ada pilihan 1 sampai 5!");
					injadwal1 = "A";
				}else{
					System.out.println("\nInput jadwal keberangkatan berhasil.\n");		
				}
			}
		}while(!injadwal1.matches("[0-9]+"));


//*/
		int tickets = 0;
		String tickets1 = "";
		do{
			System.out.print("Jumlah tiket yang dipesan: ");
			tickets1 = scan.nextLine();
			if(tickets1.length() == 0)
					System.out.println("Masukkan jumlah tiket yang dipesan tidak boleh kosong.");
			else if(!tickets1.matches("[0-9]+") && tickets1.length() > 2 || (!tickets1.matches("[0-9]+") && tickets1.length() >= 1 && tickets1.length() <= 2))
					System.out.println("\nMasukkan harus berupa angka saja.");
			else{
				tickets = Integer.parseInt(tickets1);	
				if(tickets < 1){
					System.out.println("\nMaaf, minimal memesan 1 tiket");
					tickets1 = "A";
				}else if(tickets > 10){
					System.out.println("\nMaaf, maksimal memesan 10 tiket");
					tickets1 = "A";
				}else{
					System.out.println("\nInput Jumlah Tiket berhasil!\n");	
				}
			}
		}while(!tickets1.matches("[0-9]+"));

		if(kota[berangkat-1].equals(kota[0])){
			if(kota[tujuan-1].equals(kota[1])){
				harga = hargaTiket[5];
				estimasi = "1 jam 34 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[2])){
				harga = hargaTiket[1];
				estimasi = "58 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[3])){
				harga = hargaTiket[2];
				estimasi = "1 jam 4 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[4])){
				harga = hargaTiket[0];
				estimasi = "47 menit";
				totalBayar = harga * tickets;
			}
		}else if(kota[berangkat-1].equals(kota[1])){
			if(kota[tujuan-1].equals(kota[0])){
				harga = hargaTiket[5];
				estimasi = "1 jam 34 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[2])){
				harga = hargaTiket[0];
				estimasi = "45 menit";
				totalBayar = harga * tickets;
			}		
			else if(kota[tujuan-1].equals(kota[3])){
				harga = hargaTiket[3];
				estimasi = "1 jam 13 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[4])){
				harga = hargaTiket[1];
				estimasi = "1 jam 10 menit";
				totalBayar = harga * tickets;
			}
		}else if(kota[berangkat-1].equals(kota[2])){
			if(kota[tujuan-1].equals(kota[0])){
				harga = hargaTiket[1];
				estimasi = "58 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[1])){
				harga = hargaTiket[0];
				estimasi = "45 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[3])){
				harga = hargaTiket[4];
				estimasi = "1 jam 33 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[4])){
				harga = hargaTiket[1];
				estimasi = "1 jam 10 menit";
				totalBayar = harga * tickets;
			}
		}else if(kota[berangkat-1].equals(kota[3])){
			if(kota[tujuan-1].equals(kota[0])){
				harga = hargaTiket[3];
				estimasi = "1 jam 4 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[2])){
				harga = hargaTiket[4];
				estimasi = "1 jam 33 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[1])){
				harga = hargaTiket[3];
				estimasi = "1 jam 13 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[4])){
				harga = hargaTiket[3];
				estimasi = "1 jam 29 menit";
				totalBayar = harga * tickets;
			}
		}else if(kota[berangkat-1].equals(kota[4])){
			if(kota[tujuan-1].equals(kota[0])){
				harga = hargaTiket[0];
				estimasi = "47 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[1])){
				harga = hargaTiket[1];
				estimasi = "1 jam 10 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[3])){
				harga = hargaTiket[3];
				estimasi = "1 jam 29 menit";
				totalBayar = harga * tickets;
			}
			else if(kota[tujuan-1].equals(kota[2])){
				harga = hargaTiket[1];
				estimasi = "1 jam 10 menit";
				totalBayar = harga * tickets;
			}
		}



		String[] kursi = new String[30];
		int[] kursinya = new int[tickets];
		for (int i = 0; i < kursi.length;i++)
			kursi[i] = "O";
			
		int kursiTerisi = 1 + rand.nextInt(20);

		for(int i = 0; i < kursiTerisi; i++){
			kursi[rand.nextInt(30)] = "X"; 
		}
		
		if(kursiTerisi + tickets <= 30){
			int pilihKursi = 0;
			String pilihKursi1 = "";
			for (int j = 0; j < tickets; j++) {
				System.out.println("Ketersediaan Kursi Bus");
				System.out.println("Tanda (O) menandakan bahwa kursi tersedia");
				System.out.println("Tanda (X) menandakan bahwa kursi tidak tersedia");
				for(int i = 0; i <= 25; i += 5) {
					System.out.println((i+1) + "(" + kursi[i] + ")" + "\t" + (i+2) + "(" + kursi[i+1] + ")" +"\t\t" + (i+3) + "(" + kursi[i+2] + ")" +"\t" + (i+4) + "(" + kursi[i+3] + ")" +"\t" + (i+5) + "(" + kursi[i+4] + ")");
				}
				
				do{	
				System.out.print("Masukkan kursi untuk tiket " + (j+1) + ": ");
				pilihKursi1 = scan.nextLine();

					if(pilihKursi1.length() == 0)
						System.out.println("Masukkan kursi tidak boleh kosong.");
					else if(!pilihKursi1.matches("[0-9]+") || pilihKursi1.length() > 2 || (!pilihKursi1.matches("[0-9]+") && pilihKursi1.length() < 2))
						System.out.println("\nMasukkan harus berupa angka saja.");
					else{
						pilihKursi = Integer.parseInt(pilihKursi1);	
						if(pilihKursi >= 1 && pilihKursi <= 30){
							if(kursi[pilihKursi-1].equals("X")){
								String kursi2 = "X";
								do{	
									System.out.println("Kursi yang dipilih tidak tersedia. Silahkan pilih kursi yang lain.");
									System.out.print("Masukkan kursi untuk tiket " + (j+1) + ": ");
									pilihKursi1 = scan.nextLine();
									if(pilihKursi1.length() == 0)
										System.out.println("Masukkan kursi tidak boleh kosong.");
									else if(!pilihKursi1.matches("[0-9]+") || pilihKursi1.length() > 2 || (!pilihKursi1.matches("[0-9]+") && pilihKursi1.length() < 2))
										System.out.println("\nMasukkan harus berupa angka saja.");
									else{
										pilihKursi = Integer.parseInt(pilihKursi1);
										if(pilihKursi >= 1 && pilihKursi <= 30)
										kursi2 = kursi[pilihKursi-1];
										else
										System.out.println("Hanya ada kursi 1 sampai 30!");	
									}
								}while(kursi2.equals("X"));
							}
							kursi[pilihKursi-1] = "X";
							System.out.println("\nInput tiket "+ (j+1) + " berhasil!\n");
							kursinya[j] = pilihKursi;
						}else{
							System.out.println("Hanya ada kursi 1 sampai 30!");
							pilihKursi1 = "A";
						}
					}
	
				}while(!pilihKursi1.matches("[0-9]+"));
			}
		}else{
			System.out.println("Kursi Sudah Penuh.");
		}

//*
		System.out.println("Total yang harus dibayar: Rp. " + totalBayar);

		System.out.print("\nMetode Pembayaran: ");
		System.out.println("1. Tunai");
		do{
			System.out.print("\nMasukkan Metode Pembayaran: ");
			bayar1 = scan.nextLine();
			if(bayar1.length() == 0)
				System.out.println("Masukkan metode pembayaran tidak boleh kosong.");
			else if((!bayar1.matches("[0-9]+") && bayar1.length() > 1) || (!bayar1.matches("[0-9]+") && bayar1.length() == 1))
				System.out.println("\nMasukkan harus berupa angka saja.");
			else{
				bayar = Integer.parseInt(bayar1);	
				if(bayar < 1 || bayar > 1){
					System.out.println("\nHanya ada 1 pilihan!");
					bayar1 = "A";
				}else
					System.out.println("\nInput metode pembayaran berhasil.\n");		
			}
		}while(!bayar1.matches("[0-9]+"));

		do{
		System.out.print("Masukkan Jumlah Uang : Rp. ");
		jumlahBayar1 = scan.next();
			if(jumlahBayar1.length() == 0) {
				System.out.println("Masukkan Jumlah Uang Tidak Boleh Kosong!");
			}
			else if(!jumlahBayar1.matches("[0-9]+")){
					System.out.println("\nMasukkan harus berupa angka saja.");
			}
			else {
				jumlahBayar = Integer.parseInt(jumlahBayar1);	
				kembali = jumlahBayar - totalBayar;
				if(jumlahBayar > totalBayar){
					System.out.println("\nKembalian Anda : Rp. " + kembali);
					System.out.println("\nInput pembayaran berhasil.\n");				
				}
				else if(jumlahBayar == totalBayar) 
					System.out.println("\nInput pembayaran berhasil.\n");				
				else {
					System.out.println("Uang Tidak Cukup!");
					jumlahBayar1 = "A";
				}
			}
		}while(!jumlahBayar1.matches("[0-9]+"));

		//print tiket
		System.out.println("\n=================== STRUK PEMESANAN TIKET BUS ===================");
		System.out.println("Nama Pemesanan: " + nama);
		System.out.println("No. " + indentitas + ": " + noIdentitas);
		System.out.println("Titik berangkat: " + kota[berangkat-1]);
		System.out.println("Titik tujuan: " + kota[tujuan-1]);
		System.out.println("Jam Keberangkatan: " + jadwal[injadwal-1]);
		System.out.println("Estimasi Perjalanan: " + estimasi);
		System.out.println("Jumlah tiket yang dipesan: " + tickets);
		System.out.print("Kursi yang dipesan: ");
		for(int i = 0; i < kursinya.length;i++) {
			if(i != kursinya.length-1)
				System.out.print(kursinya[i] + ", ");
			else
				System.out.println(kursinya[i] + " seat");			
		}
		System.out.println("Kode Tiket: " + nama.toUpperCase().substring(0,3) + kota[berangkat-1].toUpperCase().substring(0,3) + kota[tujuan-1].toUpperCase().substring(0,3) + jadwal[injadwal-1].substring(0,2) + jadwal[injadwal-1].substring(3) + tickets + rand.nextInt(100));
		System.out.println("\n=================================================================");
		System.out.print("Terimakasih Telah Memesan Tiket Bus Disini.");
		System.out.println("\n=================================================================");
//*/
	}

	public static void cetakKota(String[] kota){
		for(int i = 0;i < kota.length;i++) 
			System.out.println((i+1) + ". " + kota[i]);
	}
}