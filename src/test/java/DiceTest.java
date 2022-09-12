import org.junit.Assert;
import org.junit.Test;


public class DiceTest {

    @Test
    public void tossAndSum(){
        //given
        Dice dice = new Dice(2);
        //when
        int actual = dice.tossAndSum();
        //then

        Assert.assertTrue(actual < 12 && actual >2);
    }



}