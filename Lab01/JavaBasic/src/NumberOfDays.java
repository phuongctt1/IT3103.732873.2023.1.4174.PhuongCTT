import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Prompt for month input
        System.out.print("Enter the month (full name, abbreviation, or number): ");
        String monthInput = keyboard.nextLine();

        // Normalize month input to number format
        int month = getMonthNumber(monthInput);

        // Validate month input
        while (month == -1) {
            System.out.print("Invalid month. Please enter again: ");
            monthInput = keyboard.nextLine();
            month = getMonthNumber(monthInput);
        }

        // Prompt for year input
        System.out.print("Enter the year: ");
        int year = keyboard.nextInt();

        // Validate year input
        while (year < 0) {
            System.out.print("Invalid year. Please enter again: ");
            year = keyboard.nextInt();
        }

        // Check if it is a leap year
        boolean isLeapYear = isLeapYear(year);

        // Get the number of days in the month
        int numberOfDays = getDaysInMonth(month, isLeapYear);

        // Display the result
        System.out.println("The number of days in " + getMonthName(month) + " " + year + " is " + numberOfDays + " days.");
    }

    // Method to get the month number from user input
    public static int getMonthNumber(String monthInput) {
        if (monthInput.equalsIgnoreCase("January") || monthInput.equalsIgnoreCase("Jan") || monthInput.equalsIgnoreCase("Jan.") || monthInput.equals("1")) {
            return 1;
        } else if (monthInput.equalsIgnoreCase("February") || monthInput.equalsIgnoreCase("Feb") || monthInput.equalsIgnoreCase("Feb.") || monthInput.equals("2")) {
            return 2;
        } else if (monthInput.equalsIgnoreCase("March") || monthInput.equalsIgnoreCase("Mar") || monthInput.equalsIgnoreCase("Mar.") || monthInput.equals("3")) {
            return 3;
        } else if (monthInput.equalsIgnoreCase("April") || monthInput.equalsIgnoreCase("Apr") || monthInput.equalsIgnoreCase("Apr.") || monthInput.equals("4")) {
            return 4;
        } else if (monthInput.equalsIgnoreCase("May") || monthInput.equals("5")) {
            return 5;
        } else if (monthInput.equalsIgnoreCase("June") || monthInput.equalsIgnoreCase("Jun") || monthInput.equalsIgnoreCase("Jun.") || monthInput.equals("6")) {
            return 6;
        } else if (monthInput.equalsIgnoreCase("July") || monthInput.equalsIgnoreCase("Jul") || monthInput.equalsIgnoreCase("Jul.") || monthInput.equals("7")) {
            return 7;
        } else if (monthInput.equalsIgnoreCase("August") || monthInput.equalsIgnoreCase("Aug") || monthInput.equalsIgnoreCase("Aug.") || monthInput.equals("8")) {
            return 8;
        } else if (monthInput.equalsIgnoreCase("September") || monthInput.equalsIgnoreCase("Sep") || monthInput.equalsIgnoreCase("Sept") || monthInput.equalsIgnoreCase("Sep.") || monthInput.equalsIgnoreCase("Sept.") || monthInput.equalsIgnoreCase("9")) {
            return 9;
        } else if (monthInput.equalsIgnoreCase("October") || monthInput.equalsIgnoreCase("Oct") || monthInput.equalsIgnoreCase("Oct.") || monthInput.equals("10")) {
            return 10;
        } else if (monthInput.equalsIgnoreCase("November") || monthInput.equalsIgnoreCase("Nov") || monthInput.equalsIgnoreCase("Nov.") || monthInput.equals("11")) {
            return 11;
        } else if (monthInput.equalsIgnoreCase("December") || monthInput.equalsIgnoreCase("Dec") || monthInput.equalsIgnoreCase("Dec.") || monthInput.equals("12")) {
            return 12;
        } else {
            return -1; // Invalid month
        }
    }

    // Method to check if it is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }

    // Method to get the month name
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid";
        }
    }
}
