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

    }
}
