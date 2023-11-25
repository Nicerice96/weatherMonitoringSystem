import java.util.ArrayList;

public class weatherSystemAlert implements  notifyWeather {

    private int state;
    private ArrayList<deviceObserver> observersList;


    public weatherSystemAlert(){

    }
    private void addObserver(deviceObserver device){


        observersList.add(device);

    }

    private void removeObserver(deviceObserver device){

        observersList.remove(device);

    }

    @Override
    public void Attach(deviceObserver device) {

    }

    @Override
    public void Detach(deviceObserver device) {

    }

    @Override
    public void NotifyObseervers() {

    }
}
