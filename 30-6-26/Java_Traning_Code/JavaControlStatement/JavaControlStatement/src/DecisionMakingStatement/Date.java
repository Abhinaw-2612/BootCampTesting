package DecisionMakingStatement;
import java.time.LocalDate;
import java.time.Month;
public class Date {

	public static void main(String[] args) {


		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		Month month = today.getMonth();
		int year = today.getYear();

		System.out.println("Today date"  + day + "" + month + "" + year + "");

		switch(month){
		case JANUARY :
		System.out.println("Month is January");
		break;

		case FEBRUARY :
		System.out.println("Month is Februrary");
		break;

		case MARCH :
		System.out.println("Month is March");
		break;

		case APRIL :
		System.out.println("Month is april");
		break;

		case MAY :
		System.out.println("Month is may");
		break;

		case JUNE :
		System.out.println("Month is June");
		break;


		case JULY :
		System.out.println("Month is July");
		break;

		case AUGUST :
		System.out.println("Month is august");
		break;

		case SEPTEMBER :
		System.out.println("Month is september");
		break;


		case OCTOBER :
		System.out.println("Month is ocotber");
		break;


		case NOVEMBER :
		System.out.println("Month is novmeber");
		break;

		case DECEMBER :
		System.out.println("Month is december");
		break;

		default:
		System.out.println("Invalid month");
		break;
		}



	}

}
