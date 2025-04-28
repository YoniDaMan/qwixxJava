public class Board {

    private Row[] rows;
    private int strikes;

    public Board() {
        rows = new Row[4];
        
        rows[0] = new Row(false); // Red
        rows[1] = new Row(false); // Yellow
        rows[2] = new Row(true); // Green
        rows[3] = new Row(true); // Blue
        
        strikes = 0;
    }

    public void takeTurn(int row, int number) {
        rows[row].cross(number);
    }

    public void takeStrike() {
        strikes += 1;
    }
}
