package exercise1;

public class Main1 {

	public static void main(String[] args) {
		
	System.out.println(stringaPariDispari("Ajeje"));
	System.out.println(annoBisestile(2023));

	}

	static boolean stringaPariDispari (String stringa) {
		return stringa.length() % 2 == 0? true : false;
				}
	static boolean annoBisestile (int year) {
		if(year % 4 == 0) {
			return true;
		} else if (year % 100 == 0 && year % 400 == 0){
			return true;
      }else {
    	  return false;
      }
	}
}
