import java.util.Scanner; // to handle input
import java.util.regex.Pattern; // to create MM DD YYYY pattern
import java.util.regex.Matcher; // to validate MM DD YYYY input

public class Date {  

    // defaults to private and non-static, must create object to utilize this func
    int serialJulianDate(int month, int day, int year) {
        int a = (14-month) / 12;
        int m = month + 12* a - 3;
        int y = year + 4800 - a;
        int nDate = day + ( (153*m + 2) / 5 ) + 365*y + (y / 4) - (y / 100) + (y / 400) - 32045;
        return nDate;
    }

    public static void main(String[] args) {
        Date GtoJ = new Date();

        Scanner input = new Scanner(System.in);
        
        // while loop condition
        boolean userState = true;
        
        // toggles while loop condition
        String yesNo; 
        
        // Define regex for MM DD YYYY pattern
        String datePattern = "^(0[1-9]|1[0-2])\s(0[1-9]|[12][0-9]|3[01])\s([0-9]{4})$";
        Pattern pattern = Pattern.compile(datePattern);

        while(userState) {

            System.out.print("Enter a date in the format MM DD YYYY, with spaces included: ");
            
            // read the entire line
            String date = input.nextLine();

            // Check if input matches MM DD YYYY pattern
            Matcher matcher = pattern.matcher(date);
            
            // validate and parse input
            if(matcher.matches()) {
                try {
                    // split the string into elements separated by spaces into an array
                    String[] dateParts = date.split(" ");

                    // process user date input as (MM DD YYYY)
                    int result = GtoJ.serialJulianDate( Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]) );
                    System.out.println("\tSerial Julian Date: " + result);

                    // determine whether user wants to continue program
                    System.out.print("\tWould you like to enter another date to convert? (y/n): ");
                    yesNo = input.nextLine().trim(); // reads input and removes whitespaces
                
                    // users wants to exit program
                    if ( !( yesNo.equals("y") || yesNo.equals("Y") ) ) { 
                    userState = false; // program will terminate on next while loop iteration
                    continue;
                    }
                }    
                catch(NumberFormatException errorObject) {
                    System.out.println("\tMust enter only integers and whitespaces.");
                }
            }
            else {
                System.out.println("\tInput must follow the pattern MM DD YYYY, with spaces included, and in-bounds integers.\n");
            }

        }

        input.close(); // close scanner for memory safety

    }

}
