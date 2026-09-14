package at1;
import javax.swing.JOptionPane;
public class main {
	public static void main(String[] args) {
		int array[] = new int[10];
		String text = "";
		
		for (int i = 0; i <= 9; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um numero:"));
			text = text + " " + array[i];
			JOptionPane.showMessageDialog(null,"Valores da array: " + text);
		}
		JOptionPane.showMessageDialog(null,"Valores da array: " + text);
	}
}
