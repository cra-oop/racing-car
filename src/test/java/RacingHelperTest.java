import org.junit.Assert;
import org.junit.Test;

public class RacingHelperTest {
    @Test
    public void 랜덤함수만들기() {
        //테스트를 어떻게 해야할지 애매
        RacingHelper helper = new RacingHelper(0, 10);
        int num = helper.generateRandomNumber();
        Assert.assertTrue(num < 10);
    }
    @Test
    public void 앞으로갈지안갈지 () {
        RacingHelper helper = new RacingHelper(5, 10);

        for(int i = 0 ; i < 10 ; i ++){
            if (i < 5) {
                Assert.assertFalse(helper.goFowardOrNot(i));
            } else {
                Assert.assertTrue(helper.goFowardOrNot(i));
            }
        }
    }
}
