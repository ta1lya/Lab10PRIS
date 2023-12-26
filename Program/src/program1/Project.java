package program1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


public class Project {

    private ResearchEmployee researchEmployee;

    public String name;
    public Date start;
    public Date end;
    public int hours;

    public int getProjectCompleteANumberOfHours() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите дату начала проекта (ГГГГ-ММ-ДД): ");
        String startProjectInput = scan.nextLine();
        LocalDate start = LocalDate.parse(startProjectInput);

        System.out.println("Введите дату конца проекта (ГГГГ-ММ-ДД): ");
        String endProjectInput = scan.nextLine();
        LocalDate end = LocalDate.parse(endProjectInput);

        long projectDays = ChronoUnit.DAYS.between(start, end);
        return (int) projectDays;
    }

}
