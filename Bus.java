import java.util.*;

class Bus {
  private int number;
  private ArrayList<Person> passenger;

  public Bus(int number){
    this.number = number;
    this.passenger = new ArrayList<Person>();
  }

  public int getNumber(){
    return this.number;
  }

  public void addPassenger(Person name) {
    if (isBusFull()) return;

    passenger.add(name);
  }

  public int passengerCount(){
    return passenger.size();
  }

  public boolean isBusFull(){
    if (passengerCount() >= 5){
      return true;
    }
    return false;
  }

  public void depart() {
    if (passengerCount() > 0){
      passenger.remove(0);
      }
    }
  }
