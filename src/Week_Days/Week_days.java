package Week_Days;

public class Week_days {
    public static void main(String[] args) {
        Weekdays gunler = Weekdays.SUNDAY;

        switch (gunler){
            case MONDAY:
                System.out.println("1-ci");
                break;
            case TUESDAY:
                System.out.println("2-ci GUN");
                break;
            case WEDNESDAY:
                System.out.println("3-c GUN");
                break;
            case THURSDAY:
                System.out.println("4-CI GUN");
                break;
            case FRIDAY:
                System.out.println("5-CI GUN");
                break;
            case SATURDAY:
                System.out.println("6-CI GUN");
                break;
            case SUNDAY:
                System.out.println("7-CI GUN");
                break;
        }

    }

}
