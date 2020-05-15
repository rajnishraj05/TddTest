import java.time.Year;
import java.util.Scanner;

public class CalanderTest {
	
	public static void main(String args[]) {
		try (Scanner yearObj = new Scanner(System.in)) {
			System.out.println("Enter Year : ");
			int year = yearObj.nextInt();
			System.out.println(checkLeapYear(year)? "Leap Year" : 
			        "Not a Leap Year" );
			System.out.println(Year.isLeap(year)? "Leap Year" : 
		        "Not a Leap Year");
		}catch (Exception e) {
			System.out.println("Enter valid year");
		}
		
	}
	
	public static boolean checkLeapYear(int year) {
		boolean leap = false;
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
		
	 return leap;
	}

}
