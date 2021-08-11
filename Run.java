package ak.apps.trackedhabits;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Run extends Habits
{
    private String runTime;
    private String runDate;
    public Run() {}

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String inputRunTime) {
        this.runTime = inputRunTime;
    }

    public String getRunDate() {
        return runDate;
    }

    public void setRunDate(String inputRunDate) {
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