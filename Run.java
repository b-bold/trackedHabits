package ak.apps.trackedhabits;
import java.text.SimpleDateFormat;

public class Run implements java.io.Serializable
{
    private SimpleDateFormat("HH.mm.ss") runTime;
    private SimpleDateFormat("mm/dd/yyyy") runDate;
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

    public static void main(String args[]) {
        Run r = new Run();
        r.setRunDate("03/04/1987");
        r.setRunTime("00.09.30");
        System.out.println(r.getRunDate());
        System.out.println(r.getRunTime();
    }

    }

