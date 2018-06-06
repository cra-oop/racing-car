import java.util.Random;

public class RacingHelper {

    private Random random;
    private int limit;
    private int randomRange;

    public RacingHelper() {
        random = new Random();
        this.limit = 0;
    }

    public RacingHelper(int limit,int randomRange) {
        random = new Random();
        this.limit = limit;
        this.randomRange = randomRange;
    }

    public int generateRandomNumber() {
        return random.nextInt(this.randomRange);
    }
    public boolean goFowardOrNot(int number){
        return number >= limit;
    }
}
