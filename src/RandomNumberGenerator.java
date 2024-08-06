import java.util.Random;

public class RandomNumberGenerator {

    private final Random random;

    public RandomNumberGenerator(){
        random = new Random();
    }

    public RandomNumberGenerator(Random random){
        this.random = random;
    }

    public int getNextInt(int origin, int bound){
        if (origin >= bound) {
            throw new IllegalArgumentException("Origin must be less than bound");
        }
        int [] numArray = random.ints(1, origin, bound).toArray();
        return numArray[0];
    }
}
