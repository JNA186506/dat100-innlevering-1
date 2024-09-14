package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {

		int skatteTrinn[] = { 292851, 670001, 937001, 1350001 };
		double skatteSats[] = { 0.017, 0.04, 0.136, 0.166, 0.176 };

		int trinn = 0;
		double sats = 0;
		int skatteTrinnStart = 208051;

		while (trinn < skatteTrinn.length && inntekt() > skatteTrinn[trinn]) {
			trinn++;
		}

		for (int i = 0; i <= trinn; i++) {
			int trinnStart = 0;
			if (i == 0) {
				trinnStart = Math.min(skatteTrinn[i], inntekt()) - skatteTrinnStart;
			} else if (i == trinn) {
				trinnStart = inntekt() - skatteTrinn[i - 1];
			} else {
				trinnStart = skatteTrinn[i] - skatteTrinn[i - 1];
			}
			sats += trinnStart * skatteSats[i];
		}

		JOptionPane.showMessageDialog(null, "Du skal betale " + sats + " i trinnskatt");
	}

	public static int inntekt() {

		int lesInntekt = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din inntekt:"));

		return lesInntekt;
	}


}
