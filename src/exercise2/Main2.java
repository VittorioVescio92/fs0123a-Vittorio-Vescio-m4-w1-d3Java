package exercise2;

public class Main2 {

	public static void main(String[] args) {
		stampaInLettere(5);

	}

	static void stampaInLettere(int num) {
		if(num >=0 && num <=3) {
		switch (num) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		}
		}else {
			System.out.println("il numero non è compreso tra 0 e 3");
		}
	}

}