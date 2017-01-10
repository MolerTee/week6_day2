import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person steven;

  @Before
  public void before() {
    bus = new Bus(19);
    steven = new Person();
  }

  @Test
  public void hasNumber(){
    assertEquals(19, bus.getNumber());
  }

  @Test
  public void startsWithNoPassenger(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void passengersCanBoard(){
    bus.addPassenger(steven);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 5; i++){
      bus.addPassenger(steven);
    }
    assertEquals(5, bus.passengerCount());
  }

  @Test
  public void busFullAfter5Passengers(){
    for (int i = 0; i<5; i++){
      bus.addPassenger(steven);
    }
    assertEquals(true , bus.isBusFull());
  }

  @Test
  public void canPassengersEscape(){
    bus.addPassenger(steven);
    bus.depart();
    assertEquals(0, bus.passengerCount());
  }
}