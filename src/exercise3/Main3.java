package exercise3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
//		qFinder("AIUTO");
cercaQ();
	}
	
	public static void qFinder (String stringa) {
		label:
		while (!stringa.contains(":q")) {
			String[] chars = stringa.split("");
			for (String c : chars) {
				if(c.equals(":")) {
					break label;
				}else {
					System.out.print(c + ",");
				}
			}
			
		}
	}
	
	        public static void cercaQ() {
	          Scanner scanner = new Scanner(System.in);
	          String input = "";

	              while (!input.contains(":q")) {
	                  System.out.print(" Inserisci una parola");
	                  input = scanner.nextLine();
	                  if (!input.contains(":q")) {
	                      String[] chars = input.split("");
	                      for (String c : chars) {
	                          System.out.print(c + ",");
	                      }
	                      System.out.println();
	                  }
	          }
	          scanner.close();
	        }
	    }
	

