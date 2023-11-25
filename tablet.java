public class tablet implements deviceObserver{


    String state;

    private weatherSystemAlert weatherStation;

    public tablet(weatherSystemAlert weatherStation, String initalState){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
        this.state = initalState;
    }
    @Override
    public void update() {



    }
}
