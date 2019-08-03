package b04;

public class S39SwitchEnum {

    public static void main(String[] args) {
        S39WeekendDay day = S39WeekendDay.SATURDAY;

        // ...

        switch (day) {
        case SATURDAY:
            System.out.println("No alarm clock today");
            break;
        case SUNDAY:
            System.out.println("Ready for a new week?");
            break;
        }
    }
}