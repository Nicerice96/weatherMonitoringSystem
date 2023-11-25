public class Iphone implements deviceObserver{

    String state;

    private weatherSystemAlert weatherStation;

    public Iphone(weatherSystemAlert weatherStation, String initalState){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
        this.state = initalState;
    }
    @Override
    public void update() {

    }
}
