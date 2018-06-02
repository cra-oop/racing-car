package domain;

import service.RaceFactory;

import java.util.List;


//builder 패턴을 사용해보자.
//체이닝이 가능하도록, 예) race.play().view();
public class Race {

    private List<Car> cars;
    private int numCars;
    private int numLaps;

    //객체에서 get으로 가져오는걸 피해야한다고 했는데
    //다른 방법은 없을까

    //MEMO: strategy pattern?
    //장점: 다른 Config가 오면 다른 실행/추가적인 수행을 할 수 있다.
    //장점: 테스트할 때 테스트용 Config로 갈아끼울 수도 있다. 즉, 유연하다.
    public Race(IConfig raceConfig) {
        numCars = raceConfig.getNumCars();
        numLaps = raceConfig.getNumLaps();
        initialize();
    }

    private void initialize() {

        //factory 패턴
        //장점:??
        for (int i =0; i<numCars; i++){
            cars.add(RaceFactory.createCar(0));
        }

    }

    public Race play(){
        //내부에 있는 Car들을 모두 정해진 바퀴수 만큼 움직인다. (레이스를 끝낸다)

        return this;
    }
    public void move(){
        //내부에 가지고 있는 Car들을 모두 `한번만` 움직인다.

    }
    public void add(Car car){
        this.cars.add(car);
    }

    public void show() {
        //this가 race에 대한 정보를 가지고 있으니
        //호출 요청이 오면 뷰로 뿌려준다
        System.out.println("결과는 :");
    }
}
