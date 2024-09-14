package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {
	
	public static void main(String[] args) {
		
		int n = 1;
		int x = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));

		for (int i = 1; i <= x; i++) {
			n = n * i;
		}
		JOptionPane.showMessageDialog(null, "Fakultet av " + x + " er " + n);
	}

}
