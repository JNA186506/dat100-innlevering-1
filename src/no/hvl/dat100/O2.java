package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {
	public static void main(String[] args) {

		int studenter[] = new int [antallStudenter()];
	
		
		for (int i = 1; i <= studenter.length; i++) {
			char karakter = KarakterSkala(lesKarakter());
			JOptionPane.showMessageDialog(null, "Student " + i + " fikk " + karakter);
			System.out.println("Student " + i + " fikk " + karakter);
		}
		
}


	public static char KarakterSkala(int karakter) {

		if (karakter >= 90 && karakter <= 100) {
			return 'A';
		} else if (karakter < 90 && karakter >= 80) {
			return 'B';
		} else if (karakter < 80 && karakter >= 60) {
			return 'C';
		} else if (karakter < 60 && karakter >= 50) {
			return 'D';
		} else if (karakter < 50 && karakter >= 40) {
			return 'E';
		} else {
			return 'F';
		} 

	}

	public static int lesKarakter() {

	String karakter = null;	
	
	while (karakter == null) {
		
		karakter = JOptionPane.showInputDialog("Skriv inn hvilken poengsumen du fikk");
		int studKarakter = Integer.parseInt(karakter);
		
		if (studKarakter > 100 || studKarakter < 0) {
			JOptionPane.showMessageDialog(null, "Ikke en lovlig verdi. Skriv inn ny verdi.");
			karakter = null;
		} 
	}
	return Integer.parseInt(karakter);
}
		
	public static int antallStudenter() {
		
		String antStudent = null;
		
		while (antStudent == null) {
			antStudent = JOptionPane.showInputDialog("Skriv inn antall studenter");
			
			if (!antStudent.matches("\\d+")) {
				JOptionPane.showMessageDialog(null, "Ikke en lovlig verdi. Skriv inn ny verdi.");
				antStudent = null;
			}
		}
	
		return Integer.parseInt(antStudent);
	}

}
