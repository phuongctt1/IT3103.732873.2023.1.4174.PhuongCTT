import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "Cao Thi Thu Phuong - 4174 -You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, "Cao Thi Thu Phuong - 4174 - Please input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + "and" ;
		strNum2 = JOptionPane.showInputDialog(null, "Cao Thi Thu Phuong - 4174 - Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		
		JOptionPane.showMessageDialog(null, strNotification, "Show two Number", JOptionPane.INFORMATION_MESSAGE );
		System.exit(0);
	}

}
