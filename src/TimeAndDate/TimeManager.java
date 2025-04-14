package TimeAndDate;

public class TimeManager {
    private int day;
    private int month;
    private int year;
    private String season; //this season

    //
    public TimeManager() {
        this.day = 1;   //starting from day one
        this.month = 1; // starting from month one
        this.year = 1;  // starting from year one
        this.season = "Spring"; //   Starting from Spring
    }

    //increase one day
    public void nextDay() {
        day++;
        if (day > 30) { // هر ماه 30 روز
            day = 1;
            nextMonth();
        }
    }

    // increase one month
    public void nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        updateSeason();
    }
    // increase one year
    public void nextYear() {
        year++;
    }

    // Update Seasons
    private void updateSeason() {
        switch (month) {
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Fall";
                break;
            case 12: case 1: case 2:
                season = "Winter";
                break;
        }
    }

    // receive date of now
    public String getCurrentDate() {
        return "Year: " + year + ", Month: " + month + ", Day: " + day;
    }

    // receive this Season
    public String getCurrentSeason() {
        return "Current Season: " + season;
    }
}
