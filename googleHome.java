public class googleHome implements deviceObserver{

    String state;

    private weatherSystemAlert weatherStation;

    public googleHome(weatherSystemAlert weatherStation, String initalState){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
        this.state = initalState;
    }
    @Override
    public void update() {

        String updatedState = weatherStation.getState();
        System.out.println("googleHome received update. New state: " + updatedState);

    }
}
