import org.junit.Assert;
import org.junit.Test;

public class MyCarTest {
    @Test
    public void 앞으로가기(){
        RacingCar car = new MyCar();
        Assert.assertEquals(0, car.getPosition());
        car.goForward();
        Assert.assertEquals(1, car.getPosition());
    }
}
