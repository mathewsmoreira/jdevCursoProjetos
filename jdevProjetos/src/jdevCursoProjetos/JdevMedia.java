package jdevCursoProjetos;

import javax.swing.JOptionPane;

public class JdevMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* estanciado as variaveis de nota */

		String nota1 = JOptionPane.showInputDialog("Digite a nota n1");
		String nota2 = JOptionPane.showInputDialog("Digite a nota n2");
		String nota3 = JOptionPane.showInputDialog("Digite a nota n3");
		String nota4 = JOptionPane.showInputDialog("Digite a nota n4");

		/* convertendo as variaveis para double */

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		if (media > 5) {

			if (media >= 7) {
				JOptionPane.showMessageDialog(null, "A aluno aprovado com media: " + media);
			}
			if (media >=5 && media < 7) {
				JOptionPane.showMessageDialog(null, "A aluno em recuperação com media: " + media);
			}

		} else {
			JOptionPane.showMessageDialog(null, "A aluno reprovado com media: " + media);
		}

	}

}
