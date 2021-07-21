package ak.apps.trackedhabits;
import java.text.SimpleDateFormat;

public class Run implements java.io.Serializable
{
    private SimpleDateFormat("HH.mm.ss") runTime;
    private SimpleDateFormat("dd/MMMM/yyyy") runDate;
    public Run() {}

    public SimpleDateFormat getRunTime() {
        return runTime;
    }

    public void setRunTime(SimpleDateFormat inputRunTime) {
        this.runTime = inputRunTime;
    }

    public SimpleDateFormat getRunDate() {
        return runDate;
    }

    public void setRunDate(SimpleDateFormat inputRunDate) {
        this.runDate = inputRunDate;
    }
}

