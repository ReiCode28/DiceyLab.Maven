import java.util.Random;

public class Dice {

    private Integer numberOfDice;
    private Integer rollResult;
    private Integer seed;
    private Random random = new Random();
    public Dice(int numberOfDice){
        this.numberOfDice=numberOfDice;
    }

    public Dice(Integer numberOfDice, int seed){
        this.numberOfDice = numberOfDice;
        this.seed = seed;

    }


    public Integer tossAndSum(){
        Integer rollSum = 0;
        for(int i=0; i<numberOfDice; i++){
            rollResult = random.nextInt(6) + 1;
            rollSum += rollResult;

        }
        return rollSum;
    }

    public Integer tossAndSumSeed(){
        Random random = new Random(seed);
        Integer rollSum = 0;
        for(int i=0; i<numberOfDice; i++){
            rollResult = random.nextInt(6) + 1;
            rollSum += rollResult;

        }
        return rollSum;
    }


}
