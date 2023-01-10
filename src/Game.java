import java.util.Arrays;

public class Game {
    private int playersNum;
    private Die[] rolls;

    private int[] points;
    private int[] nums;
    private int doubles;

    private int turn;


    public Game(int playersNum) {
        this.playersNum = playersNum;
        rolls = new Die[playersNum];
        points = new int[playersNum];

        nums = new int[6];
        for(int i = 0; i < 6; i++) nums[i] = 0;
        doubles = 0;
        turn = 0;
    }

    public int getPlayersNum() {
        return playersNum;
    }

    public void setPlayersNum(int playersNum) {
        this.playersNum = playersNum;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    //O(2 + n=6) = O(8)
    @Override
    public String toString() {
        return "(" + "playersNum=" + playersNum + ", Number Rarity=" + Arrays.toString(nums) + ", doubles=" + doubles + ')';
    }

    //O(2 + n=6) = O(8)
    public void printRarity(){
        System.out.println("Number Rarity=" + Arrays.toString(nums));
    }

    //input - a player num and their roll
    public void update(int playerNum, Die roll){
        this.turn = playerNum;
        this.rolls[playerNum] = roll;
        this.nums[roll.getNum1()]++;
        this.nums[roll.getNum2()]++;

    }


    //checks if the roll is a double
    //O(1)
    public void checkDoubles(int playerNum){
        if(this.rolls[playerNum].getNum1() == this.rolls[playerNum].getNum2()) doubles++;
    }

    //changes the turn to the next player
    //O(1)
    public void nextTurn(){
        if(this.turn >= this.playersNum) this.turn = 0;
        else turn++;
    }
    // input - the player number, output - the points of the same player.
    public int getPlayerPoints(int playerNum){
        return this.points[playerNum];
    }
}
