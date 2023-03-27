import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {

    List<Holiday> holidays = new ArrayList<>();
    holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
    holidays.add(new Holiday("21/02/2023", "Carnaval"));
    holidays.add(new Holiday("17/04/2023", "Páscoa"));
    holidays.add(new Holiday("21/04/2023", "Tiradentes"));
    holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
    holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
    holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
    holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
    holidays.add(new Holiday("02/11/2023", "Finados"));
    holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
    holidays.add(new Holiday("25/12/2023", "Natal"));

    listHolidays(holidays);
    searchHoliday(holidays, "17/04/2023");
  }

  

  public static void searchHoliday(List<Holiday> holidays, String date) {

    boolean found = false;
    for (Holiday holiday : holidays) {
      if (holiday.getDate().equals(date)){
        System.out.println("--------------------------------");
        System.out.println(holiday.getDate());
        System.out.println(holiday.getName());
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("No holiday with that date was found!");
    }
  }

  public static void listHolidays(List<Holiday> holidays) {
    System.out.println("List of all holidays:");
    System.out.println("--------------------------------------------------");

    holidays.forEach(holiday -> {
      System.out.println(holiday.getDate());
      System.out.println(holiday.getName());
      System.out.println("--------------------------------");
    });
  }
}
