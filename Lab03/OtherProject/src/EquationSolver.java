import javax.swing.JOptionPane;
public class EquationSolver {
	
	public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Which equation do you want to solve?\n1. First-degree equation (linear equation) with one variable\n2. System of first-degree equations (linear system) with two variables\n3. Second-degree equation with one variable");
        
        switch (option) {
            case "1":
                solveFirstDegreeEquation();
                break;
            case "2":
                solveLinearSystem();
                break;
            case "3":
                solveSecondDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please choose a valid option.");
                break;
        }
    }
    
    private static void solveFirstDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a (coefficient of x):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b (constant term):"));
        
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid equation. 'a' cannot be zero.");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution is x = " + x);
        }
    }
    
    private static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b2:"));
        
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D == 0 && D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "Infinite solutions. The system has infinitely many solutions.");
        } else if (D == 0 && (D1 != 0 || D2 != 0)) {
            JOptionPane.showMessageDialog(null, "No solution. The system has no solution.");
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "The solution is:\nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
    
    private static void solveSecondDegreeEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a (coefficient of x^2):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b (coefficient of x):"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c (constant term):"));
        
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid equation. 'a' cannot be zero.");
        } else {
            double discriminant = b * b - 4 * a * c;
            
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                JOptionPane.showMessageDialog(null, "The solutions are:\nx1 = " + x1 + "\nx2 = " + x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The solution is x = " + x);
            } else {
                JOptionPane.showMessageDialog(null, "No real solution. The equation has no real roots.");
            }
        }
    }
}
