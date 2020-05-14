public class OpeningHours {

    public String openTime(String day) {

        if (day.equals("SUNDAY")) {
            return "Sorry, we are closed Sundays";
        } else if (day.equals("MONDAY")) {
            return "We are open from 9am to 8pm on Monday's";
        } else if (day.equals("TUESDAY")) {
            return "We are open from 9am to 8pm on Tuesday's";
        } else if (day.equals("WENESDAY")) {
            return "We are open from 9am to 8pm on Wednesday's";
        } else if (day.equals("THURSDAY")) {
            return "We are open from 9am to 8pm on Thursday's";
        } else if (day.equals("FRIDAY")) {
            return "We are open from 9am to 8pm on Friday's";
        } else if (day.equals("SATURDAY")) {
            return "We are open from 10am to 6pm on Saturday's";
        }

        return day;

    }

}