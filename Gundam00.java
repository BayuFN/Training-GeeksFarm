public class Gundam00 extends Gundam{ //pewarisan dari class Gundam
	//pendefinisian variable
	private String nama;
	private String tim;
	private String pilot;

	//overidding method tampil() pada class MobileSuit
	public void tampil(){
		System.out.println("Class Gundam 00 (Child Class dari class Gundam)");
	}

	//pembuatan method setter
	public void setNama(String nama){
		this.nama=nama;
	}
	public void setTim(String tim){
		this.tim=tim;
	}
	public void setPilot(String pilot){
		this.pilot=pilot;
	}

	//pembuatan method getter
	public String getNama(){
		return nama;
	}
	public String getTim(){
		return tim;
	}
	public String getPilot(){
		return pilot;
	}

	//method menampilkan nama,tim,pilot
	public void tampilVariable(){
		System.out.println("Gundam "+nama+" merupakan bagian dari tim "+tim+" dan dipiloti oleh "+pilot);
	}

	
}