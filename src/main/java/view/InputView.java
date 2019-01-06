package view;

import domain.StdRaceConfig;

import java.util.List;
import java.util.Scanner;

public class InputView {

    public static StdRaceConfig scanConfig() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        int numLaps = scanner.nextInt();
        return new StdRaceConfig(numLaps);
    }

    public static String[] scanNameList() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        String carNamesInput = scanner.nextLine();
        String[] carNames = carNamesInput.split(",");
        return carNames;
    }

}
