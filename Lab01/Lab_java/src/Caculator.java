import javax.swing.JOptionPane;
public class Caculator {
	public static void main(String[] args) {
        String strNum1, strNum2;
        
        strNum1 = JOptionPane.showInputDialog(null, "Cao Thi Thu Phuong - 4174 -Enter the first number", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Cao Thi Thu Phuong - 4174 - Enter the second number", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        // Calculate and display the sum
        double sum = num1 + num2;
        String sumResult = "Sum: " + sum;

        // Calculate and display the difference
        double difference = num1 - num2;
        String differenceResult = "Difference: " + difference;

        // Calculate and display the product
        double product = num1 * num2;
        String productResult = "Product: " + product;

        // Calculate and display the quotient
        String quotientResult;
        if (num2 != 0) {
            double quotient = num1 / num2;
            quotientResult = "Quotient: " + quotient;
        } else {
            quotientResult = "Cannot divide by zero.";
        }

        String result = sumResult + "\n" + differenceResult + "\n" + productResult + "\n" + quotientResult;
        JOptionPane.showMessageDialog(null, result, "Calculation Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
