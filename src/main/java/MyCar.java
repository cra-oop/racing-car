public class MyCar implements RacingCar {

    private int position;

    public MyCar() {
        this.position = 0;
    }

    @Override
    public void goForward() {
        this.position ++;
    }

    @Override
    public int getPosition() {
        return this.position;
    }

    @Override
    public void printPosition() {
        for(int i = 0 ; i < this.position; i ++){
            System.out.print('-');
        }
        System.out.println();
    }
}
