public class Main implements InterfaceGundam{ //implementasi interface InterfaceGundam

	//melengkapi abstract method pada InterfaceGundam
	public void tampil(){
		System.out.println("class Main (Implementasi Interface)");
	}
	public void keterangan(){
		System.out.println("Ini merupakan method abstrak dari interface InterfaceGundam");
	}

	public static void main(String[] args) {
		//intansiasi class Gundam pada objek g
		Gundam g = new Gundam();

		//memanggil method tampil() pada class Gundam menggunakan instance objek g
		g.tampil();

		//memanggil method overload pada class Gundam
		g.jenisGundam("RX-02");
		g.jenisGundam("00","Barbatoz");
		g.jenisGundam("Build Fighter",25);

		g.keterangan();

		System.out.println();

		//intansiasi class Gundam00 pada objek g1
		Gundam00 g1 = new Gundam00();

		//menset nilai dengan memanggil method setter setiap variable
		g1.setNama("Exia");
		g1.setTim("Celestial Being");
		g1.setPilot("Setsuna F Seiei");

		//menampilkan method tampil() yg merupakan overidding dari class Gundam
		g1.tampil();
		//menampilkan isi variable dengan memanggil method pada class Gundam00
		g1.tampilVariable();

		System.out.println();

		Main m = new Main();
		m.tampil();
		m.keterangan();
	}
}