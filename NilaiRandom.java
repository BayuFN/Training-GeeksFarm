import java.util.*;

public class NilaiRandom{
	
	public static void main (String[] args){
		NilaiRandom na = new NilaiRandom();
		int i=15;

		while(i > 0){
			System.out.print(na.nilaiAcak(4,10)+ " ");
			i--;
		}
	}


	public int nilaiAcak(int max, int min){
		int range = Math.abs(max-min)+1;
		return (int)(Math.random()*range) + (min <= max ? min : max);
	}
}