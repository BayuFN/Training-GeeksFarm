import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;

public class SoalNo9{
	public static void main (String[] args){
	int[] nilai = {78,60,62,68,71,68,73,85,66, 64, 76, 63, 75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73};
	int jumlah =0;

	//mencari nilai rata-rata
	for(int x : nilai){
		jumlah += x;
	}
	float rata = jumlah/nilai.length;
	System.out.println("Average Temperature is: "+rata);

	nilai = IntStream.of(nilai).distinct().toArray();

	//urut secara ascending
	Arrays.sort(nilai);
	System.out.print("List of seven lowest temperature  : ");	
	for(int i =0;i<7;i++){
		System.out.print(nilai[i]+",");
	}

	System.out.println();

	//urut secara descending
	Arrays.sort(nilai);
	System.out.print("List of seven highest temperature : ");	
	for(int i = nilai.length-7 ; i<nilai.length ; i++){
		System.out.print(nilai[i]+",");
	}
  }
}