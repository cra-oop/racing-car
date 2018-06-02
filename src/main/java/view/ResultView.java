package view;

import domain.Race;

public class ResultView {

    Race raceResult;

    public ResultView(Race race){
        this.raceResult = race;
    }

    public void show(){
        //TODO: 요구사항에 맞게 출력한다
        //매회 주어진 환경변수에 맞는 결과만 출력?
        System.out.println(this.raceResult);
    }


    public static void print(Race race) {
    }
}
