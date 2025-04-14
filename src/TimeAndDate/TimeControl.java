package TimeAndDate;

public class TimeControl {
    private TimeManager timeManager;

    public TimeControl() {
        timeManager = new TimeManager();
    }

    // time of game
    public void advanceTime() {
        timeManager.nextDay();
        System.out.println("Advanced Time: " + timeManager.getCurrentDate());
        System.out.println(timeManager.getCurrentSeason()); //show next season !
    }
    // show the Date of now!
    public void showDate() {
        System.out.println("Current Date: " + timeManager.getCurrentDate());
        System.out.println("Current Season: " + timeManager.getCurrentSeason());
    }
}
