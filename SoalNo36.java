public class SoalNo36{
	public static void main (String[] args){
		String[] array = {"Bayu","Fajar","Nugraha"};

		//Uppercase
		System.out.print("Uppercase Element : ");
		for(String a : array){
			System.out.print(a.toUpperCase()+" ");
		}

		System.out.println();

		//Lowercase
		System.out.print("Lowercase Element : ");
		for(String a : array){
			System.out.print(a.toLowerCase()+" ");
		}
	}
}