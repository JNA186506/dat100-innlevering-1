package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {
	
	private static final int skatteTrinn[] = { 292851, 670001, 937901, 1350001 };
	private static final double skatteSats[] = { 0.017, 0.04, 0.136, 0.166, 0.176 };

	
	public static void main(String[] args) {
		int inntekt = 670100;
//		int inntekt = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din inntekt"));
		

		JOptionPane.showMessageDialog(null, "Du skal betale " + dinSkatt(inntekt, trinn(inntekt)) + " i trinnskatt");
	}
	
	private static int trinn(int trinn) {
		
		int trinnN = 0;
		
		while (trinnN < skatteTrinn.length && trinn > skatteTrinn[trinnN]) {
			trinnN++;
		}
		
		return trinnN;
		
	}


	public static double dinSkatt(int inntekt, int trinn) {
		
		int sats = 0;
		int skatteTrinnStart = 208051;

		for (int i = 0; i <= trinn; i++) {
			int trinnStart = 0;
			if (i == 0) {
				trinnStart = Math.min(skatteTrinn[i], inntekt) - skatteTrinnStart;
			} else if (i <= trinn) {
				trinnStart = inntekt - skatteTrinn[i - 1];
			} else {
				trinnStart = skatteTrinn[i] - skatteTrinn[i - 1];
			}
			sats += trinnStart * skatteSats[i];
		}
		return sats;
	}

}
