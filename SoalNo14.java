public class SoalNo14{
	public static void main(String[] args){
	String[] data = {"asaead", "adawa", "afgbcvjaa", "uawe"};
		Integer maxLength = data[0].length();
		Integer minLength = data[0].length();
		
		for (String s : data) {
			Integer temp = s.length();
			if (temp > maxLength) {
				maxLength = temp;
			}

			if (temp < minLength) {
				minLength = temp;
			}
		}
		System.out.println("Shortest array is : "+minLength);
		System.out.println("Longest array is  : "+maxLength);
	}
}