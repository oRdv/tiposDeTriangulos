package sp.senai.jandira.br;

import javax.swing.JOptionPane;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strLadoA, strLadoB, strLadoC;
		double ladoA, ladoB, ladoC;

		strLadoA = JOptionPane.showInputDialog("Olá, informe o tamanho do lado A");
		ladoA = Double.parseDouble(strLadoA);

		strLadoB = JOptionPane.showInputDialog("Agora o lado B");
		ladoB = Double.parseDouble(strLadoB);

		strLadoC = JOptionPane.showInputDialog("E por último o lado C");
		ladoC = Double.parseDouble(strLadoC);

		if (ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoB + ladoA) {
			JOptionPane.showMessageDialog(null,
					"Não é um triângulo!!");

		} else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			JOptionPane.showMessageDialog(null,
					"As inforações que foram dadas forma um triângulo Escaleno, que todos o lados são diferentes.");

		} else if (ladoA == ladoB && ladoB == ladoC) {
			JOptionPane.showMessageDialog(null,
					"As inforações que foram dadas forma um triângulo Equilátero, que todos o lados são iguais.");
		} else {
			JOptionPane.showMessageDialog(null, "As inforações que foram dadas forma um triângulo Isóceles, que é dois lados iguais e um diferente.");
		}

	}

}
