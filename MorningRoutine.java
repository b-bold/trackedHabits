package ak.apps.trackedhabits;

public class MorningRoutine implements java.io.Serializable
{
    private boolean isMorningRoutineDone;
    public MorningRoutine() {}

    public boolean getIsMorningRoutineDone() {
        return isMorningRoutineDone;
    }

    public void setIsMorningRoutineDone(boolean morningRoutineDone) {
        this.isMorningRoutineDone = morningRoutineDone;
    }

}