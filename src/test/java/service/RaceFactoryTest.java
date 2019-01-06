package service;

import domain.Car;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class RaceFactoryTest {
    @Test
    public void 차를생성한다(){
        Car expectedCar = new Car("jeff");
        assertThat(expectedCar.equals(RaceFactory.createCar("jeff")));
    }
}
