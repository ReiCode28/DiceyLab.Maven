import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void getBin() {
        // given
        Bins bins = new Bins(2,12);
        //when
        int expected = 0;
        int actual = bins.getBin(4);
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void incrementBin() {
        // given
        Bins bins = new Bins(2,12);
        //when
        bins.incrementBin(4);
        int expected = 1;
        int actual = bins.getBin(4);
        //then
        Assert.assertEquals(expected, actual);
    }
}