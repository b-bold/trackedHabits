package ak.apps.trackedhabits;
import java.text.SimpleDateFormat;

public class SweatOrRegret
{
    private SimpleDateFormat("HH.mm.ss") sweatTime;
    private SimpleDateFormat("dd/MMMM/yyyy") sweatDate;
    public SweatOrRegret() {}

    public SimpleDateFormat getSweatTime() {
        return sweatTime;
    }

    public void setRunTime(SimpleDateFormat inputSweatTime) {
        this.sweatTime = inputSweatTime;
    }

    public SimpleDateFormat getSweatDate() {
        return sweatDate;
    }

    public void setSweatDate(SimpleDateFormat inputSweatDate) {
        this.sweatDate = inputSweatDate;
    }

}