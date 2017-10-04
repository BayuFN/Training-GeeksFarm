public class Gundam extends MobileSuit{ //extend abstract class MobileSuit

	//membuat method tuntuk menampilkan text
	public void tampil(){
		System.out.println("Class Gundam (Turunan abstract class MobileSuit)");
	}

	//membuat overloading method (polymorphism)
	public void jenisGundam(String jenis1){
		System.out.println("Jenis Gundam pertama adalah Gundam "+jenis1);
	}
	public void jenisGundam(String jenis1, String jenis2){
		System.out.println("Series Gundam yang paling saya sukai adalah Gundam "+jenis1+" dan Gundam "+jenis2);	
	}
	public void jenisGundam(String jenis1, int episode){
		System.out.println("Ada berbagai jenis Gundam series, salah satunya adalah Gundam "+jenis1+" dengan jumlah episode "+episode);
	}

	//memanggil abstract method pada class MobileSuit
	public int totalDurasi(int durasi, int episode){
		int total = durasi*episode;
		return total;
	}
	public void keterangan(){
		System.out.println("Dengan jumlah episode 25 dan durasi per episode selama 24 menit maka total durasi dalam satu season adalah "+totalDurasi(24,25)+" menit");
	}
}