import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Cao Thi Thu Phuong -4174-Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "you've chosen: " +  (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}
