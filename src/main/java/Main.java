import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차의 대수는 몇 대 인가요?");
        int n = sc.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int m = sc.nextInt();

        RacingCar[] car = new MyCar[n];
        RacingHelper helper = new RacingHelper(4, 10);

        for(int i=0;i<n;i++){
            car[i] = new MyCar();
        }

        System.out.println("실행 결과");
        for (int j = 0 ; j < m ; j ++){
            for (int i = 0 ; i < n ; i ++) {
                if (helper.goFowardOrNot(helper.generateRandomNumber())) {
                    car[i].goForward();
                }
                car[i].printPosition();
            }
            System.out.println();
        }
    }
}
