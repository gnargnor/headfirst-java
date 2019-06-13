import java.util.Date;

class TestDateFormats {
    public static void main (String[] args) {
        String dateAndTime = String.format("%tc", new Date());
        System.out.println(dateAndTime);

        String justTime = String.format("%tr", new Date());
        System.out.println(justTime);

        Date today = new Date();
        String dayOfWeekMonthDay = String.format("%tA, %tB %td", today, today, today);
        System.out.println(dayOfWeekMonthDay);

        String dwmdLessVerbose = String.format("%tA, %<tB %<td", today);
        System.out.println(dwmdLessVerbose);
    }
}