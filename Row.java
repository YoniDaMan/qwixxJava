public class Row {
    
    private int lastPlayed;
    private int strikes;
    private boolean decreasing;

    public Row(boolean decreasing) {
        lastPlayed = 1;
        strikes = 0;
        this.decreasing = decreasing;
        if (this.decreasing) {
            lastPlayed = 13;
        }
    }

    public boolean canCross(int value) {
        return value > lastPlayed || (decreasing && value < lastPlayed);
    }

    public void cross(int value) {
        lastPlayed = value;
        strikes += 1;
    }

    public boolean canLockout() {
        return strikes >= 5;
    }
}
