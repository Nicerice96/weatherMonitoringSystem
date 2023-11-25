import java.util.ArrayList;

public class weatherSystemAlert implements  notifyWeather {

    private String state;
    private ArrayList<deviceObserver> observersList = new ArrayList<>();


    public weatherSystemAlert(){

    }
    public void addObserver(deviceObserver device){


        observersList.add(device);

    }

    public void removeObserver(deviceObserver device){

        observersList.remove(device);

    }

    @Override
    public void Attach(deviceObserver device) {

        observersList.add(device);

    }

    @Override
    public void Detach(deviceObserver device) {

        observersList.remove(device);

    }

    @Override
    public void NotifyObseervers() {

        for (deviceObserver observer : observersList){

            observer.update();
        }

    }

    public void setState(String state){

        this.state = state;
        NotifyObseervers();

    }

    public String getState() {

        return state;
    }
}
