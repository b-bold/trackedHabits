package ak.apps.trackedhabits;
import java.text.SimpleDateFormat;

public class Sleep
{
    private SimpleDateFormat("HH.mm.ss") sleepTime;
    private SimpleDateFormat("dd/MMMM/yyyy") sleeptDate;
    public Sleep() {}

    public SimpleDateFormat getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(SimpleDateFormat inputSleepTime) {
        this.sleepTime = inputSleepTime;
    }

    public SimpleDateFormat getSleeptDate() {
        return sleeptDate;
    }

    public void setSleeptDate(SimpleDateFormat inputSleeptDate) {
        this.sleeptDate = inputSleeptDate;
    }

}