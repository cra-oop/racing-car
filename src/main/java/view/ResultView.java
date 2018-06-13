package view;

import domain.Race;
import model.RaceResult;

public class ResultView {

    RaceResult result;

    public ResultView(RaceResult result) {
        this.result = result;
    }

    public void show(){
        //TODO: 요구사항에 맞게 출력한다
        //매회 주어진 환경변수에 맞는 결과만 출력?
        System.out.println(this);
    }


    public static void print(Race race) {
    }
}
