package domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CarTest {

    @Test
    public void 전략파라미터로_전진여부를판단(){
        Car car = new Car("jeff");
        car.move(new TestStrategy());
        assertEquals(1, car.getPosition());
    }
}
